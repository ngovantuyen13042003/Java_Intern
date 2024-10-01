package com.example.internship_ngovantuyen.model.auth;

import com.example.internship_ngovantuyen.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "role")
@Entity
public class Role extends BaseEntity {
    @Column(unique = true)
    @Enumerated(value = EnumType.STRING)
    private ERole role_name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users = new ArrayList<>();
}
