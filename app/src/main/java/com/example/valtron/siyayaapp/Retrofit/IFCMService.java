package com.example.valtron.siyayaapp.Retrofit;

import com.example.valtron.siyayaapp.Model.FCMResponse;
import com.example.valtron.siyayaapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAOzMLpRM:APA91bG6oCq5RDBWM87JS9Px1BX78U-OxLix7Cb0mZATRLjyVY7K3fWg_D9ADGyMqtp04V6gb5gSW7_Cux-B50wjwveO1ggAl73RsVMebjueVO80KStiTgauuWOHUgaiags9nzbWdZ0a"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
