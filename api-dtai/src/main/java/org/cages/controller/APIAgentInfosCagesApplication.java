package org.cages.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@SpringBootApplication
public class APIAgentInfosCagesApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(APIAgentInfosCagesApplication.class, args);
    }

    // run this only on profile 'demo', avoid run this in test
    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new AgentCAGES("Comment utiliser SPRINF MVC", "Mr Ndiaye", new BigDecimal("15.41")));
            repository.save(new AgentCAGES("DEBUTER AVEC DOCKER", "Pr KAFF", new BigDecimal("9.69")));
            repository.save(new AgentCAGES("DEBUTER AVEC JAVA", "PR ", new BigDecimal("47.99")));
        };
    }
}