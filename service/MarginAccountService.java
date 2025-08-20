package service;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {

    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String id, double amount) {
        MarginAccount account = retrieveTradeAccount(id);
        account.setMargin(account.getMargin() + amount);
        repository.updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, double amount) {
        MarginAccount account = retrieveTradeAccount(id);
        if (account.getMargin() < amount) {
        throw new IllegalArgumentException("Insufficient margin");
    }
        account.setMargin(account.getMargin() - amount);
        repository.updateTradeAccount(account);
    }

    public void createTradeAccount(MarginAccount tradeAccount) {
        this.repository.createTradeAccount(tradeAccount);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount tradeAccount) {
        this.repository.updateTradeAccount(tradeAccount);
    }

    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }

}