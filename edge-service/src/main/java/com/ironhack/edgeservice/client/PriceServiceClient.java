package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.classes.Price;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("price-service")
public interface PriceServiceClient {

    @GetMapping("/prices/{serial_number}")
    Price findProductNameAndPriceBySerialNumber(@PathVariable(name = "serial_number") Long serialNumber);

}
