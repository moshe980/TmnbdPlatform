package com.example.tmnbdplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import Controller.ApiManager;

public class MainActivity extends AppCompatActivity {
    ApiManager apiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiManager= ApiManager.getInstance();



    }
}