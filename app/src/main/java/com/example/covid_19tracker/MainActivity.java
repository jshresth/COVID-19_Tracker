package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=Canada")
                .get()
                .addHeader("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "48a5d5b6c7mshe99bb4b1f187d13p17a947jsn94024e342fbc")
                .build();

        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}