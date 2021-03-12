package com.bta.casino;

import com.bta.casino.model.UserAccount;
import com.bta.casino.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CasinoDemoApplication implements CommandLineRunner {
    @Autowired
    private UserAccountRepository userAccountRepository;

    public static void main(String[] args) {
        SpringApplication.run(CasinoDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        UserAccount userAccount = UserAccount.builder()
                .firstName("Vladimir")
                .lastName("Putler")
                .taxNumber(1337L)
                .birthday(LocalDate.of(2028,3,2))
                .username("TrumpLox")
                .password("MoskvaNeRozija")
                .email("nePutin@kreml.ru")
                .balance(1000000000)
        .build();
        userAccountRepository.save(userAccount);
        long userCount = userAccountRepository.count();
        System.out.println("userAccount: " + userCount);
    }
}