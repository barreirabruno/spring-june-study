package br.com.appjuneb.JuneStudyB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {

    @Bean
    public TransactionRepository database() {
        return new TransactionRepository();
    }

    @Bean
    public CreateTransactionUsecase create() {
        return new CreateTransactionUsecase(this.database());
    }

    @Bean
    public FindTransactionUsecase findById() {
        return new FindTransactionUsecase(this.database());
    }
}
