package com.example.valtron.siyayaapp.Service;

import android.content.Intent;

import com.example.valtron.siyayaapp.CommuterCall;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MyFirebaseMessaging extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData() != null) {
            Map<String, String> data = new HashMap<>();
            String customer = data.get("customer");
            String lat = data.get("lat");
            String lng = data.get("lng");

            //LatLng customer_location = new Gson().fromJson(message, LatLng.class);

            Intent intent = new Intent(getBaseContext(), CommuterCall.class);
            intent.putExtra("lat", lat);
            intent.putExtra("lng", lng);
            intent.putExtra("customer", customer);
            //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(intent);
        }
    }
}
