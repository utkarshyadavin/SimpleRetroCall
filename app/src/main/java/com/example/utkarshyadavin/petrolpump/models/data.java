package com.example.utkarshyadavin.petrolpump.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by utkarshyadavin on 12/6/18.
 */

public class  data{

    @SerializedName("data")
    @Expose
    private CustomerAddressData customerAddressData ;

    public CustomerAddressData getCustomerAddressData() {
        return customerAddressData;
    }

    public void setCustomerAddressData(CustomerAddressData customerAddressData) {
        this.customerAddressData = customerAddressData;
    }
}
