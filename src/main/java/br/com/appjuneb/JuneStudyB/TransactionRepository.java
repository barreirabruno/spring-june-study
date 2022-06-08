package br.com.appjuneb.JuneStudyB;

import java.util.HashMap;
import java.util.Map;

public class TransactionRepository {

    final private Map<String, Transaction> inMemoryDatabase = new HashMap<>();
}
