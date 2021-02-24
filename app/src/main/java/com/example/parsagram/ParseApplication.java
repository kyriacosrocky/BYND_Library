package com.example.parsagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WrXlR7XdEEzRhupsa358Ksr4uKQpROuMmkwE4VYk")
                .clientKey("Zp0tSbTPhmeyGKhHbPkCShE4lzAQnNpnRVELm5rL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
