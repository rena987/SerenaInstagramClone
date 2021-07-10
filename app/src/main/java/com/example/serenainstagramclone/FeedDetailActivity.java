package com.example.serenainstagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.format.DateUtils;

import com.bumptech.glide.Glide;
import com.example.serenainstagramclone.databinding.ActivityFeedDetailBinding;

import org.parceler.Parcels;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FeedDetailActivity extends AppCompatActivity {

    ActivityFeedDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_feed_detail);

        String username = getIntent().getStringExtra("username");
        binding.tvUsername.setText(username);

        String description = getIntent().getStringExtra("description");
        binding.tvDescription.setText(description);

        String imageUrl = getIntent().getStringExtra("imageUrl");
        Glide.with(this).load(imageUrl).into(binding.ivImage);

        //String timestamp = getIntent().getStringExtra("createdAt");
        //binding.tvTimestamp.setText(timestamp);
    }

}