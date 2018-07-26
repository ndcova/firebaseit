package com.example.nd.sms;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "FirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
        //Get update token
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New token: " + refreshToken);


    }
}
