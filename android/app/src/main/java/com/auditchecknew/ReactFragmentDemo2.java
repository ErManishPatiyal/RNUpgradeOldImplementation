package com.auditchecknew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.facebook.react.ReactFragment;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;

public class ReactFragmentDemo2 extends AppCompatActivity implements DefaultHardwareBackBtnHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_react_fragment_demo2);
        Fragment reactNativeFragment = new ReactFragment.Builder()
                .setComponentName("AuditCheckNew")
                .build();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, reactNativeFragment)
                .commit();
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}