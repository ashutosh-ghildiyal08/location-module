package com.location.LocationModule.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.location.LocationModule.Request.AddLocationRequest;
import com.location.LocationModule.Request.UpdateLocationRequest;
import com.location.LocationModule.Service.LocationService;
import com.location.LocationModule.Service.UserLocationService;
import com.location.LocationModule.entity.Location;
import com.location.LocationModule.entity.UserLocationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @Autowired
    UserLocationService userLocationService;



    @GetMapping("/location")
    public List<Location> getAllLocation() {
        return locationService.getAllLocation();
    }

    @GetMapping("/location/{locationId}")
    public Location getSingleLocation(@PathVariable int locationId){
        return locationService.getSingleLocation(locationId);
    }
    @PostMapping("/location")
    public String addLocation(@RequestBody AddLocationRequest addLocationRequest )
    {
        locationService.addLocation(addLocationRequest);
        return "addLocationRequest";
    }


    @DeleteMapping("/location/{locationId}")
    public String deleteLocation(@PathVariable int locationId)
    {
        locationService.deleteLocationById(locationId);
        return "Location Deleted";
    }

    @PutMapping("/location")
    public UpdateLocationRequest updateLocation(@RequestBody UpdateLocationRequest updateLocationRequest)
    {
        locationService.updateLocation(updateLocationRequest);
        return updateLocationRequest;
    }

    @PostMapping("/location/{userId}/{locationId}")
    public String assignUser(@PathVariable int userId, @PathVariable int locationId ){
        userLocationService.assigningUser(userId,locationId);
        return "UserAssigned";

    }




}

