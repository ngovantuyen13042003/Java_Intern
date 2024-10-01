package com.example.internship_ngovantuyen.model.cart;

import com.example.internship_ngovantuyen.model.BaseEntity;
import com.example.internship_ngovantuyen.model.auth.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "cart")
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_id;
    private String status;
    private boolean ennable;
}
