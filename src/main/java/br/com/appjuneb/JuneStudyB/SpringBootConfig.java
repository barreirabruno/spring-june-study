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
    public TransactionsUseCase create() {
        return new TransactionsUseCase(this.database());
    }
}
