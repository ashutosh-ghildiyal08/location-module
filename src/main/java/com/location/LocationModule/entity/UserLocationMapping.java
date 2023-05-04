package com.location.LocationModule.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.nio.MappedByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

@Table(name = "location-user-mapping")
public class UserLocationMapping {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_Id", nullable = false, unique = true)
    private int user_Id;

    @Column(name = "location_Id", nullable = false, unique = true)
    private int location_Id;


}
