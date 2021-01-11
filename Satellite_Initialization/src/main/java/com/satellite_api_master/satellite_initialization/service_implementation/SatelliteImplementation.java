package com.satellite_api_master.satellite_initialization.service_implementation;


import com.satellite_api_master.satellite_initialization.model.SatelliteModel;
import com.satellite_api_master.satellite_initialization.repository.SatelliteRepository;
import com.satellite_api_master.satellite_initialization.service_interface.SatelliteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SatelliteImplementation implements SatelliteInterface {

    @Autowired
    private SatelliteRepository satelliteRepository;
    @Override
    public SatelliteModel saveSatellite(SatelliteModel satelliteModel) {
        return satelliteRepository.save(satelliteModel);
    }

    @Override
    public SatelliteModel updateSatellite(SatelliteModel satelliteModel) {
        SatelliteModel existingSatelliteModel = satelliteRepository.findById(satelliteModel.getSatelliteId()).orElse(null);
        existingSatelliteModel.setSatelliteName(satelliteModel.getSatelliteName());
        existingSatelliteModel.setCountry(satelliteModel.getCountry());
        existingSatelliteModel.setOperator(satelliteModel.getOperator());
        existingSatelliteModel.setSector(satelliteModel.getSector());
        existingSatelliteModel.setPurpose(satelliteModel.getPurpose());
        existingSatelliteModel.setPrimeContractor(satelliteModel.getPrimeContractor());
        existingSatelliteModel.setLaunchDate(satelliteModel.getLaunchDate());
        return satelliteRepository.save(existingSatelliteModel);

    }

    @Override
    public List<SatelliteModel> findAllSatellite() {
        // It returns a list so casting is needed
        return (List<SatelliteModel>) satelliteRepository.findAll();
    }

    @Override
    public void deleteSatellite(long id) {
        // To delete catalog
        satelliteRepository.deleteById(id);

    }
}
