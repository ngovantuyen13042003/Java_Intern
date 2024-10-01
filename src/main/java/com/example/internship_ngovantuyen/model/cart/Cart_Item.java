package com.example.internship_ngovantuyen.model.cart;

import com.example.internship_ngovantuyen.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "cart_item")
@IdClass(CartItemId.class)
@Entity
public class Cart_Item {
    @Id
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @Id
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Double totalPrice;

}
