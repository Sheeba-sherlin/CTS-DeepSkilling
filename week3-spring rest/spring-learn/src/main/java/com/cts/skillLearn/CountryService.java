package com.cts.skillLearn;

import java.util.List;

import com.cts.skillLearn.exception.CountryNotFoundException;

public class CountryService {

    private List<Country> countryList;

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        throw new CountryNotFoundException("Country not found");

    }

}