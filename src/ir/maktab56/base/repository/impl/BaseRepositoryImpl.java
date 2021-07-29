package ir.maktab56.base.repository.impl;

import ir.maktab56.base.domain.BaseEntity;
import ir.maktab56.base.repository.BaseRepository;

import java.sql.Connection;

public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID>
        implements BaseRepository<E, ID> {

    protected final Connection connection;

    public BaseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

}
