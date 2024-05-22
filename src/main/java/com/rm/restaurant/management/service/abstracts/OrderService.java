package com.rm.restaurant.management.service.abstracts;

import com.rm.restaurant.management.dto.OrderDto;
import com.rm.restaurant.management.model.Order;

public interface OrderService {
    Order getOneOrder(Long orderId);

    Order createOneOrder(Order newOrder);

    Order updateOneOrder(Long orderId, OrderDto newUpdateOrder);

    void deleteOneOrder(Long orderId);
}
