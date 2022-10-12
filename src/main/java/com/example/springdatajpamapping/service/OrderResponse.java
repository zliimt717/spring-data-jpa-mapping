package com.example.springdatajpamapping.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {

    private String name;
    private String productName;

    /*public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }

    private int price;*/

}
