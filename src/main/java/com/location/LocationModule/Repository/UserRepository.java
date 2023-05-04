package com.location.LocationModule.Repository;

import com.location.LocationModule.entity.Location;
import com.location.LocationModule.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}