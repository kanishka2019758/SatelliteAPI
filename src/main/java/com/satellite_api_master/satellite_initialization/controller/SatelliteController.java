package com.satellite_api_master.satellite_initialization.controller;

import java.util.Optional;

import com.satellite_api_master.satellite_initialization.model.SatelliteModel;
import com.satellite_api_master.satellite_initialization.service_implementation.SatelliteImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class SatelliteController {

    @Autowired
    private SatelliteImplementation satelliteImplementation;

    @PostMapping(value = "saveSatellite")
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel saveSatellite(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        System.out.println("Satellite added successfully");
        satelliteImplementation.saveSatellite((satelliteModel));
        return satelliteModel;
    }

    @GetMapping(value = "getAllSatellite")
    public List<com.satellite_api_master.satellite_initialization.model.SatelliteModel> findAllSatellite(){
        return  satelliteImplementation.findAllSatellite();
    }

    @GetMapping(value = "getSatelliteData/{id}")
    public SatelliteModel getSatelliteData(@PathVariable ("id") Long id){
        Optional<SatelliteModel> dataRow = satelliteImplementation.getSatelliteData(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateSatellite")
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel updateSatellite(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        return satelliteImplementation.updateSatellite(satelliteModel);
    }

    @DeleteMapping("deleteSatellite")
    public String deleteSatellite(@RequestParam long id){
        satelliteImplementation.deleteSatellite(id);
        return "Satellite deleted!";
    }

}

