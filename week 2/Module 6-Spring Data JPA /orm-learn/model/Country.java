package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import com.cognizant.ormlearn.service.StockService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockService stockService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Facebook September Stocks");
        System.out.println(stockService.getFacebookSeptember());

        System.out.println("Google Closing Price > 1250");
        System.out.println(stockService.getGoogleAbove1250());

        System.out.println("Top 3 Highest Volume");
        System.out.println(stockService.getTop3Volume());

        System.out.println("Lowest 3 Netflix Stocks");
        System.out.println(stockService.getLowestNetflix());
    }
}