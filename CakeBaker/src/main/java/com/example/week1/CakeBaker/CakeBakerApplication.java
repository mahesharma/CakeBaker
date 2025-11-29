package com.example.week1.CakeBaker;

import com.example.week1.CakeBaker.ServiceImpl.UserChoice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {

    final CakeBaker cakeBaker;
    final UserChoice userChoice;
    public CakeBakerApplication(CakeBaker cakeBaker, UserChoice userChoice) {
        this.cakeBaker = cakeBaker;
        this.userChoice = userChoice;
    }

    public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Map<Integer, String> options = new TreeMap<>();
        options.put(1, "STRAWBERRY");
        options.put(2, "CHOCOLATE");

        int frostingChoice = userChoice.getUserChoice(options, "Choose frosting:");
        int syrupChoice = userChoice.getUserChoice(options, "Choose syrup:");

        cakeBaker.bakeCake(options.get(frostingChoice), options.get(syrupChoice));
    }




}
