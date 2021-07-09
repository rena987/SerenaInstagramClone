package com.example.serenainstagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Fn3X4HdnODKoWpOQDa3c7xmGN9aGmIFI1A3u1xEO")
                .clientKey("hruQDqX6kXzGkI0eoI9dkJREtaBlDv3Pae7ibCNV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
