package com.auditchecknew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.react.modules.core.DeviceEventManagerModule;

public class OldApproach2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_approach2);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(OldApproach2.this,"Helloworld",Toast.LENGTH_LONG).show();
                ((MainApplication) getApplication()).getmReactInstanceManager().getCurrentReactContext()
                        .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("NowIdle", "");*/
            }
        });
    }

}