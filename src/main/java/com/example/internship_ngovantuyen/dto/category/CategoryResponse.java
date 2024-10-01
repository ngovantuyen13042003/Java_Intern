package com.example.internship_ngovantuyen.dto.category;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CategoryResponse {
    private Long id;
    private String category_name;
    private Long create_by;
    private Long update_by;
    private Date create_at;
    private Date update_at;

}
