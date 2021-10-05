package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo){
        return args -> {
            Student jona = new Student("Jona", "jona@gmail.com", LocalDate.of(1997, JULY, 12));
            Student alpha = new Student("alpha", "alpha@gmail.com", LocalDate.of(1997, JULY, 12));

            repo.saveAll(
                    List.of(jona,alpha)
            );
        };

    }
}
