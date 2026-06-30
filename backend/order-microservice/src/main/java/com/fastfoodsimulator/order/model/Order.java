package com.fastfoodsimulator.order.model;

import java.util.List;

public record Order(String customerFirstName, String customerLastName, List<Food> orderedFood, String address) {

}
