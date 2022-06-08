package br.com.appjuneb.JuneStudyB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    private TransactionsUseCase transactionsUseCase;

    @RequestMapping(value="/", method=RequestMethod.POST)
    @ResponseBody
    public Transaction create(@RequestBody Transaction transaction) {
        return this.transactionsUseCase.create(transaction);
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public Transaction findById(@RequestParam("transactionId") final String transactionId) {
        return this.transactionsUseCase.findById(transactionId);
    }
}
