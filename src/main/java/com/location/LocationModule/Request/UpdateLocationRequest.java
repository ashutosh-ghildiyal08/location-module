package com.location.LocationModule.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UpdateLocationRequest {
    private int id;
    private String loc_name;
    private int loc_code;
}
