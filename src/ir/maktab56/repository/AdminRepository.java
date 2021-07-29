package ir.maktab56.repository;

import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.domain.Admin;

public interface AdminRepository extends BaseRepository<Admin, Long> {

    Boolean existsByIsSuperAdmin(Boolean isSuperAdmin);

    Admin findFirstByIsSuperAdminIsTrue();
}
