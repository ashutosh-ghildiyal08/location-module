package com.location.LocationModule.Service;


import com.location.LocationModule.Repository.LocationRepository;
import com.location.LocationModule.Request.AddLocationRequest;
import com.location.LocationModule.Request.UpdateLocationRequest;
import com.location.LocationModule.Translator.ObjectTranslator;
import com.location.LocationModule.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationService {
    @Autowired
    ObjectTranslator objectTranslator;
    @Autowired
    LocationRepository locationRepository;
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    public Location getSingleLocation(int id){
        return locationRepository.findById(id).get();
    }


    public void addLocation(AddLocationRequest addLocationRequest)
    {
        Location location = objectTranslator.translate(addLocationRequest,Location.class);
        locationRepository.save(location);

    }
    public void updateLocation(UpdateLocationRequest updateLocationRequest)
    {
        Location location = objectTranslator.translate(updateLocationRequest,Location.class);
        locationRepository.save(location);
    }

    public Location deleteLocationById(int id) {
        locationRepository.deleteById(id);
        return null;
    }







}

