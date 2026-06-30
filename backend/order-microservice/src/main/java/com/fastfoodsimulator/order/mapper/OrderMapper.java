package com.fastfoodsimulator.order.mapper;

import com.fastfoodsimulator.order.controller.OrderDTO;
import com.fastfoodsimulator.order.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

  OrderDTO toDTO(Order order);

}
