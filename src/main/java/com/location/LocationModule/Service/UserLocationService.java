package com.location.LocationModule.Service;

import com.location.LocationModule.Repository.UserLocationRepository;
import com.location.LocationModule.entity.UserLocationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLocationService {
@Autowired
UserLocationRepository userLocationRepository;

    public void assigningUser(int userId, int locationId) {
        UserLocationMapping userLocationMapping = new UserLocationMapping();
        userLocationMapping.setLocation_Id(locationId);
        userLocationMapping.setUser_Id(userId);
       userLocationRepository.save(userLocationMapping);

    }
}

