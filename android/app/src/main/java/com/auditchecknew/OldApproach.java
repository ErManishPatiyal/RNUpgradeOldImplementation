package com.auditchecknew;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class OldApproach extends AppCompatActivity implements DefaultHardwareBackBtnHandler {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_approach);
        findViewById(R.id.button).setOnClickListener(v -> {
            Toast.makeText(OldApproach.this, "Helloworld", Toast.LENGTH_LONG).show();
            if (((MainApplication) getApplication()).getReactInstanceManager() != null)
                ((MainApplication) getApplication()).getReactInstanceManager().getCurrentReactContext()
                        .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("NowIdle", "");
        });
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}