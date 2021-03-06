package com.satellite_api_master.satellite_initialization.service_implementation;

import java.util.Optional;
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
        existingSatelliteModel.setPurpose(satelliteModel.getPurpose());
        existingSatelliteModel.setAddedDate(satelliteModel.getAddedDate());
        return satelliteRepository.save(existingSatelliteModel);
    }

    @Override
    public List<SatelliteModel> findAllSatellite() {
        return (List<SatelliteModel>) satelliteRepository.findAll();
    }

    @Override
    public Optional<SatelliteModel> getSatelliteData(long id) {
        return (Optional<SatelliteModel>) satelliteRepository.findById(id);
    }

    @Override
    public void deleteSatellite(long id) {
        satelliteRepository.deleteById(id);

    }
}
