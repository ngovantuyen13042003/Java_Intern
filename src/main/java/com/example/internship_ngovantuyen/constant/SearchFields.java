package com.example.internship_ngovantuyen.constant;

import java.util.List;

public interface SearchFields {
    List<String> USER = List.of(
            "username",
            "fullName",
            "email",
            "role"
    );

    List<String> CATEGORY = List.of(
            "category_name"
    );

    List<String> STYLE = List.of(
            "style_name"
    );

    List<String> DISCOUNT = List.of(
            "title"
    );

    List<String> PRODUCT = List.of(
            "product_name",
            "description",
            "style.style_name"
    );

    List<String> IMAGE = List.of(
            "product.id"
    );

    List<String> COLOR = List.of(
            "value"
    );


}
