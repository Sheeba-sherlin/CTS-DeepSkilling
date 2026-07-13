package com.cts.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.country.entity.Country;
import com.cts.country.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    // Get All Countries
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    // Get Country by Code
    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }

    // Add Country
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    // Update Country
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    // Delete Country
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    // Search Country
    public List<Country> searchCountry(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

}