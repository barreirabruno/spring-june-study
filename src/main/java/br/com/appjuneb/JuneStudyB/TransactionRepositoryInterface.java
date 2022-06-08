package br.com.appjuneb.JuneStudyB;

public interface TransactionRepositoryInterface {
    Transaction create(Transaction transaction);

    Transaction findById(String transactionId);
}
