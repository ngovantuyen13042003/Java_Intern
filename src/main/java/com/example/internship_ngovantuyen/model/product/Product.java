package com.example.internship_ngovantuyen.model.product;

import com.example.internship_ngovantuyen.model.BaseEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "product")
@Entity
public class Product extends BaseEntity {
    private String product_name;
    private String size;
    private Double price;
    private int star_rate = 5;
    private String description;
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "style_id")
    private Style style ;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product_id")
    private List<Image> images ;



}
