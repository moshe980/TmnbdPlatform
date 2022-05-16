package com.example.tmnbdplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tmnbdplatform.Logic.APIService;
import com.example.tmnbdplatform.Logic.TmbdApiManager;

public class MainActivity extends AppCompatActivity {
    private APIService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService= TmbdApiManager.getInstance();
       // apiService= MyAPIManager.getInstance();

        apiService.printAllMovies();



    }
}