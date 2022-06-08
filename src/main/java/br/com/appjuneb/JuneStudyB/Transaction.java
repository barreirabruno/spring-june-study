package br.com.appjuneb.JuneStudyB;

import java.math.BigDecimal;

public class Transaction {
    String id;
    String descriptions;
    BigDecimal amount;
    TransactionNature nature;

    public Transaction(String id, String descriptions, BigDecimal amount, TransactionNature nature) {
        this.id = id;
        this.descriptions = descriptions;
        this.amount = amount;
        this.nature = nature;
    }

    public String getId() {
        return id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionNature getNature() {
        return nature;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setNature(TransactionNature nature) {
        this.nature = nature;
    }
}
