package br.com.appjuneb.JuneStudyB;

public class FindTransactionUsecase {

    private final TransactionRepository repository;

    public FindTransactionUsecase(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction findById(String transactionId) {
        return this.repository.findById(transactionId);
    }
}
