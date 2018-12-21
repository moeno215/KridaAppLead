package com.example.maulana.kridaapp.Interface;

import com.example.maulana.kridaapp.modelLead.ResponseLead;
import com.example.maulana.kridaapp.modelLogin.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("Krida-Dev/lov2s/isotorise/{username}/{password}")
    Call<ResponseLogin> getLogin(
            @Path("username") String username,
            @Path("password") String password);

    @GET ("Krida-Dev/lov2s/getLeads/SK82")
    Call<ResponseLead> getLeads();

}

