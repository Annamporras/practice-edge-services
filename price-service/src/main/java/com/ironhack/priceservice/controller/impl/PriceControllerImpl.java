package com.ironhack.priceservice.controller.impl;

import com.ironhack.priceservice.controller.interfaces.PriceController;
import com.ironhack.priceservice.model.Price;
import com.ironhack.priceservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceControllerImpl implements PriceController {

    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("/prices/{serial_number}")
    @ResponseStatus(HttpStatus.OK)
    public Price findProductNameAndPriceBySerialNumber(@PathVariable(name = "serial_number") Long serialNumber) {

        Price price = priceRepository.findProductNameAndPriceBySerialNumber(serialNumber);

        return price;
    }
}
