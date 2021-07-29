package ir.maktab56.service;

import ir.maktab56.base.service.BaseService;
import ir.maktab56.domain.Wallet;
import ir.maktab56.service.dto.WalletChangeDTO;

public interface WalletService extends BaseService<Wallet, Long> {

    Boolean increaseWalletAmount(WalletChangeDTO changeDTO);

}
