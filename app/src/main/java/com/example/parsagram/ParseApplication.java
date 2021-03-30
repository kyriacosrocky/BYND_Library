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
                .applicationId("os6m7r08URB1vWZ2uuWFBY5UUjeos9UxmhVFv61z")
                .clientKey("5CrEjJbHVkj0bIm21cdX6SUqfK5KhHxaNAVb9PqG")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
