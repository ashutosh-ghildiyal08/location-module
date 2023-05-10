package com.location.LocationModule.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Override
    public String toString() {
        return "[" + id + " " + email + "]";
    }

}

