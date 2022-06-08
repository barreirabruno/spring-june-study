package br.com.appjuneb.JuneStudyB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    private CreateTransactionUsecase createTransactionUsecase;
    private FindTransactionUsecase findTransactionUsecase;

    @RequestMapping(value="/", method= RequestMethod.POST)
    @ResponseBody
    public Transaction create(@RequestBody Transaction transaction) {
        return this.createTransactionUsecase.create(transaction);
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    @ResponseBody
    public Transaction findById(@PathVariable("transactionId") String transactionId) {
        return this.findTransactionUsecase.findById(transactionId);
    }
}
