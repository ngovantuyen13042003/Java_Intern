package com.example.internship_ngovantuyen.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Date create_at = new Date();
    @UpdateTimestamp
    @Column(nullable = false)
    private Date update_at = new Date();
    private Long create_by;
    private Long update_by;
    private boolean ennable = true;

}
