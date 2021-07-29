package ir.maktab56.repository.impl;

import ir.maktab56.base.repository.impl.BaseRepositoryImpl;
import ir.maktab56.domain.Admin;
import ir.maktab56.repository.AdminRepository;

import java.sql.Connection;

public class AdminRepositoryImpl extends BaseRepositoryImpl<Admin, Long>
        implements AdminRepository {

    public AdminRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public Boolean existsByIsSuperAdmin(Boolean isSuperAdmin) {
        return null;
    }

    @Override
    public Admin findFirstByIsSuperAdminIsTrue() {
        return null;
    }

    @Override
    public Admin save(Admin admin) {
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }

    @Override
    public Admin[] findAll() {
        return new Admin[0];
    }

    @Override
    public Admin[] findAllById(Long[] longs) {
        return new Admin[0];
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Admin findById(Long aLong) {
        return null;
    }
}
