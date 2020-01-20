package com.lichtfragmente.wiaspot

import java.util.*

class TimeTransformer(time: Calendar) {
    private val hour = time.get(Calendar.HOUR_OF_DAY)
    private val minute = time.get(Calendar.MINUTE)

    private fun getHour(): String {
        var hour = if (minute >= 30) hour + 1 else hour
        hour = if (hour >= 12) hour - 12 else hour

        return when (hour) {
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
            0, 12 -> "zwölfe"
            else -> ""
        }
    }

    private fun getMinute(): String {
        when (minute) {
            0 -> {
                return ""
            }
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
                } + "\nnåch "
            }
            30 -> {
                return "hålbe\n"
            }
            else -> {
                return when (minute) {
                    31 -> "oans nåch\nhålbe "
                    32 -> "zwoa nåch\nhålbe "
                    33 -> "drei nåch\nhålbe "
                    34 -> "vier nåch\nhålbe "
                    35 -> "fünf nåch\nhålbe "
                    36 -> "sechs nåch\nhålbe "
                    37 -> "siebn nåch\nhålbe "
                    38 -> "åcht nåch\nhålbe "
                    39 -> "nëin nåch\nhålbe "
                    40 -> "zwanzig\nvor "
                    41 -> "nëinzehn\nvor "
                    42 -> "åchtzehn\nvor "
                    43 -> "siebzehn\nvor "
                    44 -> "sechzehn\nvor "
                    45 -> "dreiviertl\naf "
                    46 -> "vierzehn\nvor "
                    47 -> "dreizehn\nvor "
                    48 -> "zwölf\nvor "
                    49 -> "elf\nvor "
                    50 -> "zehn\nvor "
                    51 -> "nëin\nvor "
                    52 -> "åcht\nvor "
                    53 -> "siebn\nvor "
                    54 -> "sechs\nvor "
                    55 -> "fünf\nvor "
                    56 -> "vier\nvor "
                    57 -> "drei\nvor "
                    58 -> "zwoa\nvor "
                    59 -> "oans\nvor "
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

fun Calendar.getTextualTime(): String {
    return TimeTransformer(this).getTextualTime()
}