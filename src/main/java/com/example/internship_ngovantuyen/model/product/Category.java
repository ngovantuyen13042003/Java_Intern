package com.example.internship_ngovantuyen.model.product;

import com.example.internship_ngovantuyen.model.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "category")
@Entity
public class Category extends BaseEntity {
    private String category_name;

}
