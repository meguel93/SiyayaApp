package com.example.valtron.siyayaapp.Model;

public class User {
    private String vehicle_reg, status, lat, lng, avatarUrl, route;

    public User() {
    }

    public User(String vehicle_reg, String status, String lat, String lng, String avatarUrl, String route) {
        this.vehicle_reg = vehicle_reg;
        this.status = status;
        this.lat = lat;
        this.lng = lng;
        this.avatarUrl = avatarUrl;
        this.route = route;
    }

    public String getVehicle_reg() {
        return vehicle_reg;
    }

    public void setVehicle_reg(String vehicle_reg) {
        this.vehicle_reg = vehicle_reg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
