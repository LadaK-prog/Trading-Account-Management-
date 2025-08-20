package service;

public interface TradeAccountService {

    public void deposit(String id, double amount);
    public void withdraw(String id, double amount);
}