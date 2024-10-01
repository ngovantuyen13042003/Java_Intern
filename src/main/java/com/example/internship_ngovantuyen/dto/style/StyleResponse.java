package com.example.internship_ngovantuyen.dto.style;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class StyleResponse {
    private Long id;
    private String style_name;
    private Long create_by;
    private Long update_by;
    private Date create_at;
    private Date update_at;

}
