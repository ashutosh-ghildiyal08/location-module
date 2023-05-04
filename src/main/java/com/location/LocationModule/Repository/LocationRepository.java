package com.location.LocationModule.Repository;

import com.location.LocationModule.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public  interface LocationRepository extends JpaRepository<Location,Integer> {

}
