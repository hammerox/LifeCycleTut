package com.hammerox.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements BlankFragment.FragmentResponse{

    public MainActivity() {
        super();
        log("Activity + CONSTRUCTOR");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        log("Activity + onCreate before");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main, new BlankFragment())
                    .commit();
        }

        log("Activity + onCreate after");
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("Activity + onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("Activity + onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("Activity + onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("Activity + onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("Activity + onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        log("Activity + onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        log("Activity + onRestoreInstanceState");
    }


    @Override
    public void replaceFragments() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main, new BlankFragment())
                .commit();
    }

    private void log(String message) {
        Log.d("logtag", message);
    }
}
