package com.satellite_api_master.satellite_initialization.repository;


import com.satellite_api_master.satellite_initialization.model.SatelliteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends CrudRepository<SatelliteModel,Long> {
}