package org.assignment2;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;


    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + "]";
    }
}
