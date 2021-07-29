package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;

public class Wallet extends BaseEntity<Long> {

    private Customer customer;

    private Long totalAmount = 0L;

    private Long creditAmount = 0L;

    private Long cashAmount = 0L;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
