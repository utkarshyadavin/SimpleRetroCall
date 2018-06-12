package com.example.utkarshyadavin.petrolpump.api;

import com.example.utkarshyadavin.petrolpump.models.CustomerAddressData;
import com.example.utkarshyadavin.petrolpump.models.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by utkarshyadavin on 10/6/18.
 */

public interface ApiService {

   @GET("/optimized/mobiconnect/customer_account/getCustomerAddress")

   Call<data> getCustomerAddress(
           @Query("hashkey") String HashKey,
           @Query("customer_id") String CustomerId
            );
}
