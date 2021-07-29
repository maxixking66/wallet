package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.WalletLog;
import ir.maktab56.repository.WalletLogRepository;

import java.sql.Connection;

public class WalletLogRepositoryImpl extends BaseRepositoryImpl<WalletLog, Long> implements WalletLogRepository {

    public WalletLogRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public WalletLog save(WalletLog walletLog) {
        return null;
    }

    @Override
    public WalletLog update(WalletLog walletLog) {
        return null;
    }

    @Override
    public WalletLog[] findAll() {
        return new WalletLog[0];
    }

    @Override
    public WalletLog[] findAllById(Long[] longs) {
        return new WalletLog[0];
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public WalletLog findById(Long aLong) {
        return null;
    }
}
