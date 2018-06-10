package com.example.utkarshyadavin.petrolpump.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by utkarshyadavin on 10/6/18.
 */

public class Address {

    @SerializedName("firstname")
    @Expose
 private String FirstName ;
    @SerializedName("lastname")
    @Expose
 private String LastName;
    @SerializedName("street")
    @Expose
 private String Street;
    @SerializedName("city")
    @Expose
 private String City;
    @SerializedName("region_id")
    @Expose
 private String RegionId ;
    @SerializedName("region")
    @Expose
 private String Region;
    @SerializedName("country")
    @Expose
 private String Country;
    @SerializedName("pincode")
    @Expose
 private String Pincode;
    @SerializedName("phone")
    @Expose
 private String PhoneNumber;
    @SerializedName("address_id")
    @Expose
 private String AddressId;
    @SerializedName("gmap_lng")
    @Expose
 private String GmapLng;
    @SerializedName("gmap_lat")
    @Expose
 private String GmapLat;
    @SerializedName("gmap_plus_code")
    @Expose
 private String GmapPlusCode;


 // Getter methods
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getRegionId() {
        return RegionId;
    }

    public String getRegion() {
        return Region;
    }

    public String getCountry() {
        return Country;
    }

    public String getPincode() {
        return Pincode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddressId() {
        return AddressId;
    }

    public String getGmapLng() {
        return GmapLng;
    }

    public String getGmapLat() {
        return GmapLat;
    }

    public String getGmapPlusCode() {
        return GmapPlusCode;
    }

    // Setter methods

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setAddressId(String addressId) {
        AddressId = addressId;
    }

    public void setGmapLng(String gmapLng) {
        GmapLng = gmapLng;
    }

    public void setGmapLat(String gmapLat) {
        GmapLat = gmapLat;
    }

    public void setGmapPlusCode(String gmapPlusCode) {
        GmapPlusCode = gmapPlusCode;
    }
}
