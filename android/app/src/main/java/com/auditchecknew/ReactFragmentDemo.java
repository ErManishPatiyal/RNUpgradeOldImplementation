package com.auditchecknew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.react.ReactFragment;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class ReactFragmentDemo extends AppCompatActivity implements DefaultHardwareBackBtnHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_react_fragment_demo);
         Fragment reactNativeFragment = new ReactFragment.Builder()
                .setComponentName("AuditCheckNew")
                .build();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, reactNativeFragment)
                .commit();

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReactFragmentDemo.this,"Helloworld",Toast.LENGTH_LONG).show();
                startActivity(new Intent(ReactFragmentDemo.this, ReactFragmentDemo2.class));
                ((MainApplication) getApplication()).getReactInstanceManager().getCurrentReactContext()
                        .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("NowIdle", "");
            }
        });
        startActivity(new Intent(this, ReactFragmentDemo2.class));

    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}