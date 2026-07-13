package com.cognizant.ormlearn.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer>{

    // Facebook stocks in September 2019
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    // Google stocks where closing price > 1250
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double price);

    // Top 3 highest volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Lowest 3 Netflix closing prices
    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);

}