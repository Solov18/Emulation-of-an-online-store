package com.javacurse.ce.internetMagazin;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;


}
