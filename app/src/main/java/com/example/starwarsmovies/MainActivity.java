package com.example.starwarsmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.starwarsmovies.service.ApiClient;
import com.example.starwarsmovies.service.ApiInterface;

public class MainActivity extends AppCompatActivity {

    /*
    1. Make the AsyncTask.
    2. Make the connection with the network or API.
    3. Get the data from the API.
    4. Parse the JSON data to a Java Object.
    5. Integrate it somehow with the activity containing the list.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

