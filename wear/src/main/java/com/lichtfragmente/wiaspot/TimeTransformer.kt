package com.lichtfragmente.wiaspot

import java.util.*

class TimeTransformer(time: Calendar) {
    private val hour = time.get(Calendar.HOUR_OF_DAY)
    private val minute = time.get(Calendar.MINUTE)

    private fun getHour(): String {
        return when (if (hour > 12) hour - 12 else hour) {
            1 -> "oans"
            2 -> "zwoa"
            3 -> "drei"
            4 -> "viere"
            5 -> "fünfe"
            6 -> "sechse"
            7 -> "siebne"
            8 -> "åchte"
            9 -> "nëine"
            10 -> "zehne"
            11 -> "elfe"
            12 -> "zwölfe"
            else -> ""
        }
    }

    private fun getMinute(): String {
        when (minute) {
            in 1..29 -> {
                return when (minute) {
                    1 -> "oans"
                    2 -> "zwoa"
                    3 -> "drei"
                    4 -> "vier"
                    5 -> "fünf"
                    6 -> "sechs"
                    7 -> "siebn"
                    8 -> "åcht"
                    9 -> "nëin"
                    10 -> "zehn"
                    11 -> "elf"
                    12 -> "zwölf"
                    13 -> "dreizehn"
                    14 -> "vierzehn"
                    15 -> "viertl"
                    16 -> "sechzehn"
                    17 -> "siebzehn"
                    18 -> "åchtzehn"
                    19 -> "nëinzehn"
                    20 -> "zwanzig"
                    21 -> "oanezwanzig"
                    22 -> "zwoaezwanzig"
                    23 -> "dreiezwanzig"
                    24 -> "vierezwanzig"
                    25 -> "fünfezwanzig"
                    26 -> "sechsezwanzig"
                    27 -> "siebnezwanzig"
                    28 -> "åchtezwanzig"
                    29 -> "nëinezwanzig"
                    else -> ""
                } + " nåch "
            }
            30 -> {
                return "hålbe "
            }
            0 -> {
                return ""
            }
            else -> {
                return when (minute) {
                    31 -> "oans nåch hålbe "
                    32 -> "zwoa nåch hålbe "
                    33 -> "drei nåch hålbe "
                    34 -> "vier nåch hålbe "
                    35 -> "fünf nåch hålbe "
                    36 -> "sechs nåch hålbe "
                    37 -> "siebn nåch hålbe "
                    38 -> "åcht nåch hålbe "
                    39 -> "nëin nåch hålbe "
                    40 -> "zwanzig vor "
                    41 -> "nëinzehn vor "
                    42 -> "åchtzehn vor "
                    43 -> "siebzehn vor "
                    44 -> "sechzehn vor "
                    45 -> "dreiviertl af "
                    46 -> "vierzehn vor "
                    47 -> "dreizehn vor "
                    48 -> "zwölf vor "
                    49 -> "elf vor "
                    50 -> "zehn vor "
                    51 -> "nëin vor "
                    52 -> "åcht vor "
                    53 -> "siebn vor "
                    54 -> "sechs vor "
                    55 -> "fünf vor "
                    56 -> "vier vor "
                    57 -> "drei vor "
                    58 -> "zwoa vor "
                    59 -> "oans vor "
                    else -> ""
                }
            }
        }
    }

    fun getTextualTime(): String {
        if (minute == 0) {
            when (hour) {
                0 -> return "mitternåcht"
                10 -> return "holbmittåg"
                12 -> return "mittåg"
                17 -> return "feirum"
            }
        }

        return "${getMinute()}${getHour()}"
    }
}
