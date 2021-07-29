package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;
import ir.maktab56.domain.enumeration.WalletLogType;

import java.time.LocalDateTime;

public class WalletLog extends BaseEntity<Long> {

    private LocalDateTime createDate;

    private WalletLogType logType;

    private Long walletId;
    //    ownerId
    private Long customerId;

    private String uniqueCode;

    private String userType;

    private User user;

    private Long amount;

    /*private Long beforeTotalAmount;

    private Long afterTotalAmount;

    private Long beforeCreditAmount;

    private Long afterCreditAmount;

    private Long beforeCashAmount;

    private Long afterCashAmount;
    */

    private Long totalAmount;

    private Long creditAmount;

    private Long cashAmount;

    private Long creditAmountChange;

    private Long cashAmountChange;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public WalletLogType getLogType() {
        return logType;
    }

    public void setLogType(WalletLogType logType) {
        this.logType = logType;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
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

    public Long getCreditAmountChange() {
        return creditAmountChange;
    }

    public void setCreditAmountChange(Long creditAmountChange) {
        this.creditAmountChange = creditAmountChange;
    }

    public Long getCashAmountChange() {
        return cashAmountChange;
    }

    public void setCashAmountChange(Long cashAmountChange) {
        this.cashAmountChange = cashAmountChange;
    }
}
