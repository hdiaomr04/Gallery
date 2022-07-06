package com.example.bookstore.Service;

import com.example.bookstore.Model.Customer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CustomerApi {
    @POST("/api/customer/")
    Call<Customer> save(@Body Customer customer);

}
