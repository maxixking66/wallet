package ir.maktab56.domain;

public class Admin extends User {

    private Boolean isSuperAdmin;

    public Boolean getSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }
}
