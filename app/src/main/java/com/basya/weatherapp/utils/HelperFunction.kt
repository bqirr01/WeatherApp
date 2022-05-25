package com.basya.weatherapp.utils

import java.math.RoundingMode

object HelperFunction {

    fun formatDegree(temperature: Double?) : String {
        val maxTemp = temperature as Double
        val tempToCelsius = maxTemp - 273.0
        val formatDegree = tempToCelsius.toBigDecimal().setScale(2, RoundingMode.CEILING).toDouble()
        return "$formatDegree°C"
    }
}