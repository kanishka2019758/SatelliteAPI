package com.satellite_api_master.satellite_initialization.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "satellite_table",catalog = "satellite_db")
public class SatelliteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long satelliteId;
    private String satelliteName;
    private String operator;
    private String country;
    private String purpose;
    private Date addedDate = new Date();
    public SatelliteModel(){
        super();
    }

    public SatelliteModel(long satelliteId, String satelliteName, String operator, String country,
                          String purpose, Date addedDate) {
        this.satelliteId = satelliteId;
        this.satelliteName = satelliteName;
        this.operator = operator;
        this.country = country;
        this.purpose = purpose;
        this.addedDate = addedDate;
    }

    public long getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(long satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }



}
