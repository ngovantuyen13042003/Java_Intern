package com.example.internship_ngovantuyen.model.auth;

import com.example.internship_ngovantuyen.model.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
@Entity
public class User extends BaseEntity {
    private String email;
    private String password;
    private String fullName;
    private String gender;
    private Date dateOfBirth;
    private String avatar;
    private String phone;
    private String address;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles = new ArrayList<>();

}
