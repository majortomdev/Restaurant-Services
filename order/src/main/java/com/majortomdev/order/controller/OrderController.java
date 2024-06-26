package com.majortomdev.order.controller;

import com.majortomdev.order.dto.OrderDTO;
import com.majortomdev.order.dto.OrderDTOFromFE;
import com.majortomdev.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
    OrderDTO orderSavedInDB = orderService.saveOrderInDb(orderDetails);
    return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);

    }
}
