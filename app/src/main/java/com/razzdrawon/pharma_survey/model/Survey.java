package com.razzdrawon.pharma_survey.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mapadi3 on 21/06/18.
 */

public class Survey implements Serializable {

    private Integer stablishmentId;
    private Integer subtypeId;
    private String captureDate;
    private String syncDate;
    private String latitude;
    private String longitude;
    private List<Section> sections;

    public Integer getStablishmentId() {
        return stablishmentId;
    }

    public void setStablishmentId(Integer stablishmentId) {
        this.stablishmentId = stablishmentId;
    }

    public Integer getSubtypeId() {
        return subtypeId;
    }

    public void setSubtypeId(Integer subtypeId) {
        this.subtypeId = subtypeId;
    }

    public String getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(String captureDate) {
        this.captureDate = captureDate;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "stablishmentId=" + stablishmentId +
                ", subtypeId=" + subtypeId +
                ", captureDate='" + captureDate + '\'' +
                ", syncDate='" + syncDate + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", sections=" + sections +
                '}';
    }
}
