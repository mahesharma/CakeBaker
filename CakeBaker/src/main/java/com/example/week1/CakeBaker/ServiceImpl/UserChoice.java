package com.example.week1.CakeBaker.ServiceImpl;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Scanner;

@Component
public class UserChoice {

    public int getUserChoice(Map<Integer, String> options, String prompt) {
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
}
