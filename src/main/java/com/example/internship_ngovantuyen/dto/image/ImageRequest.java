package com.example.internship_ngovantuyen.dto.image;

import com.example.internship_ngovantuyen.model.product.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImageRequest {
    private String url_file;
    private Product product_id;
}
