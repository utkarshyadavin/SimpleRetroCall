package com.example.utkarshyadavin.petrolpump.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by utkarshyadavin on 10/6/18.
 */

public class CustomerAddressData {

    @SerializedName("address")
    @Expose
    private List<Address> customerAddresses = new ArrayList<Address>() ;

    @SerializedName("status")
    @Expose
    private String status ;

    @SerializedName("customer_id")
    @Expose
    private String CustomerId;

    // Getter methods
    public List<Address> getCustomerAddresses() {
        return customerAddresses;
    }

    public String getStatus() {
        return status;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    // Setter methods

    public void setCustomerAddresses(List<Address> customerAddresses) {
        this.customerAddresses = customerAddresses;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }
}