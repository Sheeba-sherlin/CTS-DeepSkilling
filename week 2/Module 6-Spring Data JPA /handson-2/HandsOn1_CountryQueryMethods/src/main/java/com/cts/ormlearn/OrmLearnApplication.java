package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    CountryService service;

    public static void main(String[] args) {

        SpringApplication.run(OrmLearnApplication.class, args);

    }

    @Override
    public void run(String... args) {

        System.out.println(service.getAllCountries());

        System.out.println(service.getCountry("IN"));

        service.addCountry(new Country("FR","France"));

        service.updateCountry(new Country("FR","French Republic"));

        service.deleteCountry("FR");

        System.out.println(service.searchCountry("Ind"));

    }

}