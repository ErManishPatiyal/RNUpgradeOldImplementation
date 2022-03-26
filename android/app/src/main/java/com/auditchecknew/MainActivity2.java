package com.auditchecknew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactFragment;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.shell.MainReactPackage;

public class MainActivity2 extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Fragment reactNativeFragment = new ReactFragment.Builder()
                .setComponentName("AuditCheckNew")
                .build();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.holder, reactNativeFragment)
                .commit();*/

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Toast.makeText(MainActivity2.this,"Helloworld",Toast.LENGTH_LONG).show();
                ((MainApplication) getApplication()).getReactInstanceManager().getCurrentReactContext()
                        .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("NowIdle", "");*/
            }
        });
    }
    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}