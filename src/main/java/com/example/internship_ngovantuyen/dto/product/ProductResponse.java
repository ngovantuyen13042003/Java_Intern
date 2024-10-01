package com.example.internship_ngovantuyen.dto.product;

import com.example.internship_ngovantuyen.dto.category.CategoryResponse;
import com.example.internship_ngovantuyen.dto.color.ColorResponse;
import com.example.internship_ngovantuyen.dto.discount.DiscountResponse;
import com.example.internship_ngovantuyen.dto.image.ImageResponse;
import com.example.internship_ngovantuyen.dto.style.StyleResponse;
import com.example.internship_ngovantuyen.model.product.Color;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class ProductResponse {
    private Long id;

    private String product_name;
    private String size;
    private Double price;
    private String description;
    private int quantity;
    private int star_rate;

    private List<ImageResponse> images;
    private DiscountResponse discount;
    private CategoryResponse category;
    private StyleResponse style;
    private ColorResponse color;


    private Long create_by;
    private Long update_by;
    private Date create_at;
    private Date update_at;

}
