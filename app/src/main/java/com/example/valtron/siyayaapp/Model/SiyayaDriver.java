package com.example.valtron.siyayaapp.Model;

public class SiyayaDriver {
    private String name, phone, avatarUrl, route;

    public SiyayaDriver() {
    }

    public SiyayaDriver(String name, String phone, String avatarUrl, String route) {
        this.name = name;
        this.phone = phone;
        this.avatarUrl = avatarUrl;
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
