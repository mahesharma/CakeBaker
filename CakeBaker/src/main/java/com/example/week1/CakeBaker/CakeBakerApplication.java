package com.example.week1.CakeBaker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner {

    final CakeBaker cakeBaker;
    public CakeBakerApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }


    public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);
	}

    private int getUserChoice(Map<Integer, String> options, String prompt) {
        System.out.println(prompt);
        options.forEach((key, value) -> System.out.println(key + ". " + value));
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (!options.containsKey(choice)) {
            choice = scanner.nextInt();
            if (!options.containsKey(choice)) {
                System.out.println("Invalid choice. Please choose again:");
            }
        }
        return choice;
    }

    @Override
    public void run(String... args) throws Exception {
        Map<Integer, String> options = new TreeMap<>();
        options.put(1, "STRAWBERRY");
        options.put(2, "CHOCOLATE");

        int frostingChoice = getUserChoice(options, "Choose frosting:");
        int syrupChoice = getUserChoice(options, "Choose syrup:");

        cakeBaker.bakeCake(options.get(frostingChoice), options.get(syrupChoice));
    }




}
