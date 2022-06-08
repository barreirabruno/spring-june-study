package br.com.appjuneb.JuneStudyB;

import java.util.HashMap;
import java.util.Map;

public class TransactionRepository implements TransactionRepositoryInterface {

    final private Map<String, Transaction> inMemoryDatabase = new HashMap<>();

    @Override
    public Transaction create(Transaction transaction) {
        this.inMemoryDatabase.put(transaction.getId(), transaction);
        return transaction;
    }

    @Override
    public Transaction findById(String transactionId) {
        return this.inMemoryDatabase.get(transactionId);
    }
}
