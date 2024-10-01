package com.example.internship_ngovantuyen.model.product;

import com.example.internship_ngovantuyen.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "color")
public class Color extends BaseEntity {
    private String value;
}
