package com.mimile.beans;


import org.springframework.data.redis.core.index.Indexed;

public class Address {
    @Indexed
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Indexed
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

}
