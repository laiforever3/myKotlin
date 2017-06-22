package com.laiforever333.mykotlin

/**
 * Created by Administrator on 2017/6/22.
 */
data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)
data class Forecast(val date: String, val description: String, val high: Int, val low: Int)
