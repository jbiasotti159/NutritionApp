package edu.quinnipiac.ser210.nutritionapp;

/*
    Jillian Biasotti
    3/22/2018
    Nutritional App Project
 */
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UPCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_upc);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

    }

    public void onContinueResult(View view) {

        EditText messageView = (EditText)findViewById(R.id.editText);
        String foodText = messageView.getText().toString();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("name", foodText);
        startActivity(intent);
    }
}

