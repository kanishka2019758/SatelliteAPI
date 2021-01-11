package com.satellite_api_master.satellite_initialization.service_interface;

import com.satellite_api_master.satellite_initialization.model.SatelliteModel;
import java.util.List;

public interface SatelliteInterface {

    // To save new catalog
    public SatelliteModel saveSatellite(SatelliteModel satelliteModel);

    // To update catalog
    public SatelliteModel updateSatellite(SatelliteModel satelliteModel);

    // To fetch all catalog from database
    public List<SatelliteModel> findAllSatellite();

    // To delete catalog
    public void deleteSatellite(long id);
}