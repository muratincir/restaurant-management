package com.rm.restaurant.management.controller;

import com.rm.restaurant.management.dto.OrderDto;
import com.rm.restaurant.management.model.Order;
import com.rm.restaurant.management.service.abstracts.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get-order/{orderId}")
    public Order getOneOrder(@PathVariable Long orderId){
        return orderService.getOneOrder(orderId);
    }

    @PostMapping
    public Order createOneOrder(@RequestBody Order newOrder){
        return orderService.createOneOrder(newOrder);
    }

    @PutMapping("/update/{orderId}")
    public Order updateOneOrder(@PathVariable Long orderId,@RequestBody OrderDto newUpdateOrder){
        return orderService.updateOneOrder(orderId,newUpdateOrder);
    }

    @DeleteMapping("/delete/{orderId}")
    public ResponseEntity<?> deleteOneOrder(@PathVariable Long orderId){
        orderService.deleteOneOrder(orderId);
        return ResponseEntity.ok("Başarıyla silinmiştir.");
    }


}
