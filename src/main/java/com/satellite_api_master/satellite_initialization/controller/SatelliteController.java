package com.satellite_api_master.satellite_initialization.controller;


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
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel saveCatalog(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        System.out.println("Satellite added successfully");
        satelliteImplementation.saveSatellite((satelliteModel));
        return satelliteModel;
    }

    @GetMapping(value = "getAllSatellite")
    public List<com.satellite_api_master.satellite_initialization.model.SatelliteModel> findAllCatalog(){
        return  satelliteImplementation.findAllSatellite();
    }

    @PutMapping("updateSatellite")
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel updateCatalog(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        return satelliteImplementation.updateSatellite(satelliteModel);
    }

    @DeleteMapping("deleteSatellite")
    public String deleteCatalog(@RequestParam long id){
        satelliteImplementation.deleteSatellite(id);
        return "Satellite deleted!";
    }

}

