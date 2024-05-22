package com.rm.restaurant.management.service.concretes;

import com.rm.restaurant.management.dto.OrderDto;
import com.rm.restaurant.management.model.Order;
import com.rm.restaurant.management.repository.OrderRepo;
import com.rm.restaurant.management.service.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderManager implements OrderService {
    private OrderRepo orderRepo;

    public OrderManager(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public Order getOneOrder(Long orderId) {
        return orderRepo.findById(orderId).orElse(null);
    }

    @Override
    public Order createOneOrder(Order newOrder) {
        return orderRepo.save(newOrder);
    }

    @Override
    public Order updateOneOrder(Long orderId, OrderDto newUpdateOrder) {
        Optional<Order> order = orderRepo.findById(orderId);
        if(order.isPresent()){
            Order foundOrder = order.get();
            foundOrder.setOrderTime(newUpdateOrder.getOrderTime());
            foundOrder.setStatus(newUpdateOrder.getStatus());
            foundOrder.setTableNumber(newUpdateOrder.getTableNumber());
            orderRepo.save(foundOrder);
            return foundOrder;
        }else{
            return null;
        }
    }

    @Override
    public void deleteOneOrder(Long orderId) {
        orderRepo.deleteById(orderId);
    }
}
