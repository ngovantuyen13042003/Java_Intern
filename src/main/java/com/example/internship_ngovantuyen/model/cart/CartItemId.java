package com.example.internship_ngovantuyen.model.cart;

import java.io.Serializable;
import lombok.Data;

@Data
public class CartItemId implements Serializable {
    private Long cart;
    private Long product;
}