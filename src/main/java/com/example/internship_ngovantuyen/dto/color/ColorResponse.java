package com.example.internship_ngovantuyen.dto.color;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ColorResponse {
    private Long id;
    private String value;
    private Long create_by;
    private Long update_by;
    private Date create_at;
    private Date update_at;



}
