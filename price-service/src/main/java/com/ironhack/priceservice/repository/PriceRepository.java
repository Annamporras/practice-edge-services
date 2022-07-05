package com.ironhack.priceservice.repository;

import com.ironhack.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    Price findProductNameAndPriceBySerialNumber(Long serialNumber);
}
