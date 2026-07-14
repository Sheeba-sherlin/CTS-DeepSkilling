package com.cts.skillLearn.controller;

import java.util.List;
import javax.validation.Valid;
import com.cts.skillLearn.Country;
import com.cts.skillLearn.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    private ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        CountryService service =
                context.getBean("countryService", CountryService.class);

        return service.getCountryList();
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("START");

        CountryService service =
                context.getBean("countryService", CountryService.class);

        Country country = service.getCountry(code);

        LOGGER.info("END");

        return country;
    }
   @PostMapping("/countries")
public Country addCountry(@RequestBody @Valid Country country) {

    LOGGER.info("START");

    LOGGER.info(country.toString());

    LOGGER.info("END");

    return country;
}

}