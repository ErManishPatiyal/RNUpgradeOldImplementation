package com.auditchecknew;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


/**
 * Created by Manish on 7/6/17.
 */

public class QuestionModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

    public QuestionModule(ReactApplicationContext reactContext) {
        super(reactContext);
        QuestionModule.reactContext = reactContext;
    }

    @ReactMethod
    public static void saveDatabase() {
        Log.i("JS Logs", "Response");
    }


    @NonNull
    @Override
    public String getName() {
        return "Questions";
    }
}
