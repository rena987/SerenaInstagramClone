package com.example.serenainstagramclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.serenainstagramclone.databinding.ActivityMainBinding;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.miLogout:
                logout();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void logout() {
        ParseUser.logOut();
        ParseUser currentUser = ParseUser.getCurrentUser();
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}