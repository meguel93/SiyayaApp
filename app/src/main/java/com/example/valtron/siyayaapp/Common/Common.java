package com.example.valtron.siyayaapp.Common;

import android.location.Location;

import com.example.valtron.siyayaapp.Model.SiyayaDriver;
import com.example.valtron.siyayaapp.Retrofit.FCMClient;
import com.example.valtron.siyayaapp.Retrofit.IFCMService;
import com.example.valtron.siyayaapp.Retrofit.IGoogleAPI;
import com.example.valtron.siyayaapp.Retrofit.RetrofitClient;

public class Common {

    //public static String currentToken = "";

    public static SiyayaDriver current_Driver = new SiyayaDriver();

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String status_tbl = "onlineStatus";
    public static final String token_tbl = "Tokens";
    public static final String user_field = "usr";
    public static final String pwd_field = "pwd";
    //public static final String user_field;

    public static Location mLastLocation = null;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static final int PICK_IMAGE_REQUEST = 9999;

    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
