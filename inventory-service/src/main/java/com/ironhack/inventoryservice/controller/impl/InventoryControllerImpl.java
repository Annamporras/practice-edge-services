package com.ironhack.inventoryservice.controller.impl;

import com.ironhack.inventoryservice.controller.interfaces.InventoryController;
import com.ironhack.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryControllerImpl implements InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/inventories/{serial_number}")
    @ResponseStatus(HttpStatus.OK)
    public int getQuantityById(@PathVariable(name = "serial_number") Long serialNumber) {
        int quantity = inventoryRepository.findById(serialNumber).get().getQuantity();
        return quantity;
    }
}
