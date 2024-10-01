package com.example.internship_ngovantuyen.dto.product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Setter
@Getter
public class ProductRequest {
    private String product_name;
    private String size;
    private Double price;
    private String description;
    private int quantity;

    private List<MultipartFile> images;
    private Long color_id;
    private Long discount_id;
    private Long category_id;
    private Long style_id;

}
