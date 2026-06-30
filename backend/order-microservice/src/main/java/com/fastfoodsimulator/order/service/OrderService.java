package com.fastfoodsimulator.order.service;

import com.fastfoodsimulator.order.model.Order;
import com.fastfoodsimulator.order.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {

  public List<Order> getOrders(OrderStatus orderStatus) {
    return Collections.emptyList(); // TODO
  }

}
