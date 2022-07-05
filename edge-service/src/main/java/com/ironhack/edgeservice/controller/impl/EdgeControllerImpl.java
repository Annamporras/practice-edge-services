package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.DTO.ProductDTO;
import com.ironhack.edgeservice.classes.Price;
import com.ironhack.edgeservice.client.InventoryServiceClient;
import com.ironhack.edgeservice.client.PriceServiceClient;
import com.ironhack.edgeservice.controller.interfaces.EdgeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeControllerImpl implements EdgeController {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @Autowired
    private PriceServiceClient priceServiceClient;

    @GetMapping("/products/{serial_number}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO findProductById(@PathVariable (name = "serial_number") Long serialNumber) {
    int quantity = inventoryServiceClient.getQuantityById(serialNumber);
    Price price = priceServiceClient.findProductNameAndPriceBySerialNumber(serialNumber);
        ProductDTO productDTO = new ProductDTO(serialNumber, quantity, price.getProductName(), price.getPrice() );
        return productDTO;
    }
}
