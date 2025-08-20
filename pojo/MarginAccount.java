package pojo;

public class MarginAccount extends TradeAccount {

    private double margin;

    public MarginAccount(String id, double margin) {
        super(id);
        this.margin = margin;
    }

    public double getMargin() {
        return this.margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    @Override
    public TradeAccount clone() {
        return new MarginAccount(super.getId(), this.margin);
    }
}
