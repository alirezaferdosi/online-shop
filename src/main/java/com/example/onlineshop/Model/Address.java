package com.example.onlineshop.Model;

public class Address {
    private String Province;
    private String city;
    private String Steet;
    private String Alley;
    private String PostalCode;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSteet() {
        return Steet;
    }

    public void setSteet(String steet) {
        Steet = steet;
    }

    public String getAlley() {
        return Alley;
    }

    public void setAlley(String alley) {
        Alley = alley;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
}
