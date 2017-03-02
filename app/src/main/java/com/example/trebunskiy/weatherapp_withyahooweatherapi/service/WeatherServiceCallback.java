package com.example.trebunskiy.weatherapp_withyahooweatherapi.service;

import com.example.trebunskiy.weatherapp_withyahooweatherapi.data.Channel;

/**
 * Created by trebunskiy on 22.02.2017.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
