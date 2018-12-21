package com.example.maulana.kridaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.maulana.kridaapp.Adapter.MyAdapter;
import com.example.maulana.kridaapp.Interface.ApiUtils;
import com.example.maulana.kridaapp.Interface.RetrofitClient;
import com.example.maulana.kridaapp.Interface.UserService;
import com.example.maulana.kridaapp.modelLead.Lead;
import com.example.maulana.kridaapp.modelLead.ResponseLead;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeadActivity extends AppCompatActivity {

    RecyclerView rcy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead);
        rcy = findViewById(R.id.recylead);
        loadData();

    }
    private void loadData() {
//        ApiService apiService = InstanceRetrofit.getInstance();
        UserService apiService = RetrofitClient.getClient().create(UserService.class);
        Call<ResponseLead> call = apiService.getLeads();
        call.enqueue(new Callback<ResponseLead>() {
            @Override
            public void onResponse(Call<ResponseLead> call, Response<ResponseLead> response) {

                if (response.isSuccessful()){
                    List<Lead> responseMovie = (List<Lead>) response.body().getLead();
//               Log.d(" ", "onResponse data: " + responseMovie);
                    MyAdapter adapter = new MyAdapter( responseMovie, LeadActivity.this);
                    rcy.setAdapter(adapter);
                    rcy.setLayoutManager(new LinearLayoutManager(LeadActivity.this));

                }
                else{
                    Toast.makeText(LeadActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }


            }


            @Override
            public void onFailure(Call<ResponseLead> call, Throwable t) {
                Log.d("", "onFailure: " + t.toString());
            }
        });
    }


}
