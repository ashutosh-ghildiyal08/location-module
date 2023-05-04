package com.location.LocationModule.Repository;

import com.location.LocationModule.entity.UserLocationMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocationMapping, Integer> {

}
