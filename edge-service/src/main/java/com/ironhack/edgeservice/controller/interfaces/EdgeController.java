package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.DTO.ProductDTO;

public interface EdgeController {

    ProductDTO findProductById(Long serialNumber);
}
