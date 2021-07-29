package ir.maktab56.repository;

import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.domain.Wallet;

public interface WalletRepository extends BaseRepository<Wallet, Long> {

    Wallet findFirstByCustomerId(Long customerId);
}
