package com.fastfoodsimulator.order.controller;

import com.fastfoodsimulator.order.mapper.OrderMapper;
import com.fastfoodsimulator.order.model.OrderStatus;
import com.fastfoodsimulator.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

  private final OrderService orderService;
  private final OrderMapper orderMapper;

  public OrderController(OrderService orderService, OrderMapper orderMapper) {
    this.orderService = orderService;
    this.orderMapper = orderMapper;
  }

  @GetMapping
  public List<OrderDTO> getOrders(@RequestParam(value = "status", defaultValue = "READY") OrderStatus orderStatus) {
    return orderService.getOrders(orderStatus).stream().map(orderMapper::toDTO).toList();
  }

}
