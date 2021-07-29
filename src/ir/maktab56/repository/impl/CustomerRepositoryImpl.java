package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.Customer;
import ir.maktab56.repository.CustomerRepository;

import java.sql.Connection;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, Long> implements CustomerRepository {

    public CustomerRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer[] findAll() {
        return new Customer[0];
    }

    @Override
    public Customer[] findAllById(Long[] longs) {
        return new Customer[0];
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Customer findById(Long aLong) {
        return null;
    }
}
