package com.vahid.weatherapp.domain.repository

import com.vahid.weatherapp.domain.util.Resource
import com.vahid.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}