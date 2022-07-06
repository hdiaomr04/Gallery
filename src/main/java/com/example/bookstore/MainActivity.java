package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookstore.Model.Customer;
import com.example.bookstore.Service.CustomerApi;
import com.example.bookstore.Service.RetrofitService;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity();
    }

    private  void  activity(){
//Assign user inputs to variables
        EditText FNAME = findViewById(R.id.fName);
        EditText LNAME = findViewById(R.id.lName);
        EditText EMAIL = findViewById(R.id.email);
        Button SUBMIT = (Button) findViewById(R.id.submit);

        // Creating objects
        RetrofitService retrofitService = new RetrofitService();
        CustomerApi  customerApi = retrofitService.getRetrofit().create(CustomerApi.class);



        // Giving the button what to do when clicked

        SUBMIT.setOnClickListener(View->{

            //Convert user inputs into strings
            String Fname = String.valueOf(FNAME.getText());
            String Lname = String.valueOf(LNAME.getText());
            String Email = String.valueOf(EMAIL.getText());

            Customer customer= new Customer();

            customer.setFirstname(Fname);
            customer.setLastname(Lname);
            customer.setEmail(Email);

            customerApi.save(customer)
                    .enqueue(new Callback<Customer>() {
                        @Override
                        public void onResponse(Call<Customer> call, Response<Customer> response) {
                            Toast.makeText(MainActivity.this, "Submitted Successfully", Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onFailure(Call<Customer> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Submission Error", Toast.LENGTH_SHORT).show();
                            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE,"Error",t);

                        }
                    });





        });

    }
}