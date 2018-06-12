package com.example.utkarshyadavin.petrolpump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.utkarshyadavin.petrolpump.api.ApiService;
import com.example.utkarshyadavin.petrolpump.models.Address;
import com.example.utkarshyadavin.petrolpump.models.CustomerAddressData;
import com.example.utkarshyadavin.petrolpump.models.data;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String hashkey = "edf67ceceac530751ff5d30c8a61733a";
    String CustomerId = "814" ;
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


        // The list now consists of the addresses of the user

        // The textview contains the firstname of the first address in the list.
        // More addresses may be present and can be retrived accordingly.


    }


    public void callapi(View view){

        getApiResponse(hashkey, CustomerId);

    }
    private void updateUi(){
        mTextView.setText(customerAddressList.get(0).getFirstName());

    }




    public void getApiResponse(String hashkey, String customerid ){

        Call<data> call = apiService.getCustomerAddress(hashkey, customerid);
        call.enqueue(new Callback<data>() {
            @Override
            public void onResponse(Call<data> call, Response<data> response) {
                if(response.isSuccessful()){
                     customerAddressList = response.body().getCustomerAddressData().getCustomerAddresses();
                    //customerAddressList = response.body().getCustomerAddresses();
                    if(customerAddressList.size()==0 ) {
                        // No Results were found
                        Log.d("Mainacitvity ka log" , "fff");
                    }
                    else {
                        updateUi();
                    }
                }
            }

            @Override
            public void onFailure(Call<data> call, Throwable t) {
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
