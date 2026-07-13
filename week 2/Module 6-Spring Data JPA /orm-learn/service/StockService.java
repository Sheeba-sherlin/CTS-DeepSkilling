package com.cognizant.ormlearn.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    public List<Stock> getFacebookSeptember() {
        return repository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019,9,1),
                LocalDate.of(2019,9,30));
    }

    public List<Stock> getGoogleAbove1250() {
        return repository.findByCodeAndCloseGreaterThan(
                "GOOGL",
                1250);
    }

    public List<Stock> getTop3Volume() {
        return repository.findTop3ByOrderByVolumeDesc();
    }

    public List<Stock> getLowestNetflix() {
        return repository.findTop3ByCodeOrderByCloseAsc("NFLX");
    }

}