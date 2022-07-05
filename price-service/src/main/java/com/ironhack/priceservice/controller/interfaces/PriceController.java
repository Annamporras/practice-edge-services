package com.ironhack.priceservice.controller.interfaces;

import com.ironhack.priceservice.model.Price;

public interface PriceController {

    Price findProductNameAndPriceBySerialNumber(Long serialNumber);


}
