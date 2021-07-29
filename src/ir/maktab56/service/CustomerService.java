package ir.maktab56.service;

import ir.maktab56.base.service.BaseService;
import ir.maktab56.domain.Customer;
import ir.maktab56.service.dto.WalletChangeDTO;

public interface CustomerService extends BaseService<Customer, Long> {

    Boolean increaseWalletAmount(WalletChangeDTO changeDTO);

}
