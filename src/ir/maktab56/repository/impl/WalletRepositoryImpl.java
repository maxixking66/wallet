package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.Wallet;
import ir.maktab56.repository.WalletRepository;

import java.sql.Connection;

public class WalletRepositoryImpl extends BaseRepositoryImpl<Wallet, Long> implements WalletRepository {

    public WalletRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public Wallet save(Wallet customer) {
        return null;
    }

    @Override
    public Wallet update(Wallet customer) {
        return null;
    }

    @Override
    public Wallet[] findAll() {
        return new Wallet[0];
    }

    @Override
    public Wallet[] findAllById(Long[] longs) {
        return new Wallet[0];
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Wallet findById(Long aLong) {
        return null;
    }
}
