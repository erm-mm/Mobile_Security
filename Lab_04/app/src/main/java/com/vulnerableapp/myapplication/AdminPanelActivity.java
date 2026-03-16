package com.vulnerableapp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class AdminPanelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        boolean isAdmin = i.getBooleanExtra("is_admin", false);

        if (isAdmin) {
            Log.d("LAB", "Admin mode enabled");
        } else {
            Log.d("LAB", "Normal user");
        }
    }
}