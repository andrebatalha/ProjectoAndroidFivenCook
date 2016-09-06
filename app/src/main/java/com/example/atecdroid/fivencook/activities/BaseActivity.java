package com.example.atecdroid.fivencook.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;

import com.example.atecdroid.fivencook.AppRec;

/**
 * Created by lol on 28-07-2016.
 */
public class BaseActivity extends Activity {

    protected AppRec mApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mApp = (AppRec) getApplication();
    }
}
