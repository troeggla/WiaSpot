package com.lichtfragmente.wiaspot

import java.util.Calendar

class DateTransformer(time: Calendar) {
    private val weekday = time.get(Calendar.DAY_OF_WEEK)
    private val day = time.get(Calendar.DAY_OF_MONTH)
    private val month = time.get(Calendar.MONTH)

    private fun getWeekday(): String {
        return when (weekday) {
            Calendar.MONDAY -> "muntig"
            Calendar.TUESDAY -> "ërtig"
            Calendar.WEDNESDAY -> "mittig"
            Calendar.THURSDAY -> "pfinstig"
            Calendar.FRIDAY -> "freitig"
            Calendar.SATURDAY -> "såmstig"
            Calendar.SUNDAY -> "sunntig"
            else -> ""
        }
    }

    private fun getMonth(): String {
        return when (month) {
            Calendar.JANUARY -> "jänner"
            Calendar.FEBRUARY -> "februar"
            Calendar.MARCH -> "märz"
            Calendar.APRIL -> "april"
            Calendar.MAY -> "mai"
            Calendar.JUNE -> "juni"
            Calendar.JULY -> "juli"
            Calendar.AUGUST -> "august"
            Calendar.SEPTEMBER -> "september"
            Calendar.OCTOBER -> "oktober"
            Calendar.NOVEMBER -> "november"
            Calendar.DECEMBER -> "dezember"
            else -> ""
        }
    }

    fun getTextualDate(): String {
        return "${getWeekday()}, ${day}. ${getMonth()}"
    }
}

fun Calendar.getTextualDate(): String {
    return DateTransformer(this).getTextualDate()
}