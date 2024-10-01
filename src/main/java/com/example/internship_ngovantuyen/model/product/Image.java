package com.example.internship_ngovantuyen.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "image")
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long image_id;
    private String url_file;
    private boolean ennable;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product_id;

}
