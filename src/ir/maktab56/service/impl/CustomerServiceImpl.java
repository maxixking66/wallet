package ir.maktab56.service.impl;

import ir.maktab56.base.service.impl.BaseServiceImpl;
import ir.maktab56.domain.Customer;
import ir.maktab56.repository.CustomerRepository;
import ir.maktab56.service.CustomerService;
import ir.maktab56.service.WalletService;
import ir.maktab56.service.dto.WalletChangeDTO;

public class CustomerServiceImpl extends BaseServiceImpl<Customer, Long, CustomerRepository>
        implements CustomerService {

    private final WalletService walletService;

    public CustomerServiceImpl(CustomerRepository repository,
                               WalletService walletService) {
        super(repository);
        this.walletService = walletService;
    }

    @Override
    public Boolean increaseWalletAmount(WalletChangeDTO changeDTO) {
//        1. is currentUser admin  -> ok
//        2. check isSuperAdmin  -> ok

        if (repository.existsById(changeDTO.getCustomerId())) {
            return walletService.increaseWalletAmount(changeDTO);
        } else {
//            throw exception
            return false;
        }

    }
}
