package pojo;

public class CashAccount extends TradeAccount {

    private double cashBalance;

    public CashAccount(String id, double cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    public double getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Override
    public TradeAccount clone() {
        return new CashAccount(super.getId(), this.cashBalance);
    }
}
