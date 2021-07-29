package ir.maktab56.domain.enumeration;

public enum WalletLogType {

    INCOME, OUTCOME;

    @Override
    public String toString() {
        switch (this) {
            case INCOME:
                return "درآمد";
            case OUTCOME:
                return "خروجی";
        }
        return super.toString();
    }
}
