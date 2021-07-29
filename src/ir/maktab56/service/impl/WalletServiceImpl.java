package ir.maktab56.service.impl;

import ir.maktab56.base.service.impl.BaseServiceImpl;
import ir.maktab56.domain.Wallet;
import ir.maktab56.domain.WalletLog;
import ir.maktab56.domain.enumeration.UserType;
import ir.maktab56.domain.enumeration.WalletLogType;
import ir.maktab56.repository.WalletRepository;
import ir.maktab56.service.WalletLogService;
import ir.maktab56.service.WalletService;
import ir.maktab56.service.dto.WalletChangeDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class WalletServiceImpl extends BaseServiceImpl<Wallet, Long, WalletRepository>
        implements WalletService {

    private final WalletLogService walletLogService;

    public WalletServiceImpl(WalletRepository repository,
                             WalletLogService walletLogService) {
        super(repository);
        this.walletLogService = walletLogService;
    }

    @Override
    public Boolean increaseWalletAmount(WalletChangeDTO changeDTO) {
        Wallet wallet = repository.findFirstByCustomerId(changeDTO.getCustomerId());
        Long beforeTotalAmount = wallet.getTotalAmount();
        wallet.setTotalAmount(beforeTotalAmount + changeDTO.getAmount());
        Long creditAmountChange = 0L;
        Long cashAmountChange = 0L;
        Long beforeCreditAmount = wallet.getCreditAmount();
        Long beforeCashAmount = wallet.getCashAmount();
        if (changeDTO.getCash()) {
            wallet.setCashAmount(beforeCashAmount + changeDTO.getAmount());
            cashAmountChange = changeDTO.getAmount();
        } else {
            wallet.setCreditAmount(beforeCreditAmount + changeDTO.getAmount());
            creditAmountChange = changeDTO.getAmount();
        }
        wallet = repository.update(wallet);

        WalletLog walletLog = new WalletLog();
        walletLog.setCreateDate(LocalDateTime.now());
        walletLog.setLogType(WalletLogType.INCOME);
        walletLog.setWalletId(wallet.getId());
//        walletLog.setCustomerId(wallet.getCustomer().getId());
        walletLog.setCustomerId(changeDTO.getCustomerId());
        walletLog.setUniqueCode(UUID.randomUUID().toString());
        walletLog.setUserType(UserType.ADMIN.name());

//        use static class to get current user
//        walletLog.setUser();

        walletLog.setAmount(changeDTO.getAmount());
        walletLog.setTotalAmount(wallet.getTotalAmount());
        walletLog.setCreditAmount(wallet.getCreditAmount());
        walletLog.setCashAmount(wallet.getCashAmount());
        walletLog.setCreditAmountChange(creditAmountChange);
        walletLog.setCashAmountChange(cashAmountChange);

        walletLogService.save(walletLog);

        return true;
    }
}
