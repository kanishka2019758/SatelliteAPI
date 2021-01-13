package com.satellite_api_master.satellite_initialization.service_interface;

import java.util.Optional;
import com.satellite_api_master.satellite_initialization.model.SatelliteModel;
import java.util.List;

public interface SatelliteInterface {

    public SatelliteModel saveSatellite(SatelliteModel satelliteModel);

    public SatelliteModel updateSatellite(SatelliteModel satelliteModel);

    public List<SatelliteModel> findAllSatellite();

    public Optional<SatelliteModel> getSatelliteData(long id);

    public void deleteSatellite(long id);
}