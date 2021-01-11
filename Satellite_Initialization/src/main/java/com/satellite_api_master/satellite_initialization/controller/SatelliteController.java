package com.satellite_api_master.satellite_initialization.controller;


import com.satellite_api_master.satellite_initialization.service_implementation.SatelliteImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Postman is used to do operations
// Therefore need to add cross origin annotation
@CrossOrigin("*")
public class SatelliteController {

    // To create bean of implementation class
    @Autowired
    private SatelliteImplementation satelliteImplementation;

    // To call save method or to save new catalog
    @PostMapping(value = "saveSatellite")
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel saveCatalog(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        System.out.println("Satellite save works properly!");
        satelliteImplementation.saveSatellite((satelliteModel));
        return satelliteModel;
    }

    // Find all catalog from db
    @GetMapping(value = "getAllSatellite")
    public List<com.satellite_api_master.satellite_initialization.model.SatelliteModel> findAllCatalog(){
        return  satelliteImplementation.findAllSatellite();
    }

    // Update catalog
    @PutMapping("updateSatellite")
    public com.satellite_api_master.satellite_initialization.model.SatelliteModel updateCatalog(@RequestBody com.satellite_api_master.satellite_initialization.model.SatelliteModel satelliteModel){
        return satelliteImplementation.updateSatellite(satelliteModel);
    }

    // Delete catalog
    @DeleteMapping("deleteSatellite")
    public String deleteCatalog(@RequestParam long id){
        satelliteImplementation.deleteSatellite(id);
        return "Satellite Deleted!";
    }

}

