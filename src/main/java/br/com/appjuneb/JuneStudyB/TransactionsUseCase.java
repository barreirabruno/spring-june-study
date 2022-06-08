package br.com.appjuneb.JuneStudyB;

public class TransactionsUseCase {

    private final TransactionRepository repository;

    public TransactionsUseCase(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction create(Transaction transaction) {
        Transaction transactionToSave = new Transaction(
                transaction.getDescriptions(),
                transaction.getAmount(),
                transaction.getNature()
        );
        return this.repository.create(transactionToSave);
    }

    public Transaction findById(String transactionId) {
        return this.repository.findById(transactionId);
    }

}
