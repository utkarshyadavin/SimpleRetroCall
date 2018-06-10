package com.example.utkarshyadavin.petrolpump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.utkarshyadavin.petrolpump.api.ApiService;
import com.example.utkarshyadavin.petrolpump.models.Address;
import com.example.utkarshyadavin.petrolpump.models.CustomerAddressData;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String hashkey = "";
    String CustomerId = "" ;
    private ApiService apiService;
    private List<Address> customerAddressList ;
    TextView mTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.firstname);
        apiService = ApiClient.getApiService();
        customerAddressList = new ArrayList<Address>();

        getApiResponse(hashkey, CustomerId);
        // The list now consists of the addresses of the user

        // The textview contains the firstname of the first address in the list.
        // More addresses may be present and can be retrived accordingly.
        mTextView.setText(customerAddressList.get(0).getFirstName());


    }




    public void getApiResponse(String hashkey, String customerid ){

        Call<CustomerAddressData> call = apiService.getCustomerAddress(hashkey, customerid);
        call.enqueue(new Callback<CustomerAddressData>() {
            @Override
            public void onResponse(Call<CustomerAddressData> call, Response<CustomerAddressData> response) {
                if(response.isSuccessful()){
                    customerAddressList = response.body().getCustomerAddresses();
                    if(customerAddressList.size()==0 ) {
                        // No Results were found
                    }
                }
            }

            @Override
            public void onFailure(Call<CustomerAddressData> call, Throwable t) {
                t.printStackTrace();
                if (t instanceof HttpException) {
                    // Catch Http Exception
                }
                else if (t instanceof IOException){
                    // Catch IO exception
                }
            }
        });
    }
}
