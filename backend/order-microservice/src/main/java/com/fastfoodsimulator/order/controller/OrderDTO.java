package com.fastfoodsimulator.order.controller;

import java.util.List;

public record OrderDTO(
    String customerFirstName,
    String customerLastName,
    List<FoodDTO> orderedFood,
    String address
) {
}
