package br.com.appjuneb.JuneStudyB;

public class CreateTransactionUsecase {

    private final TransactionRepository repository;

    public CreateTransactionUsecase(TransactionRepository repository) {
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

}
