package com.lichtfragmente.wiaspot

import java.util.*

class TimeTransformer(time: Calendar) {
    private val hour = time.get(Calendar.HOUR_OF_DAY)
    private val minute = time.get(Calendar.MINUTE)

    private fun getHour(): String {
        return when (if (hour > 12) hour - 12 else hour) {
            1 -> "Oans"
            2 -> "Zwoa"
            3 -> "Drei"
            4 -> "Viere"
            5 -> "Fünfe"
            6 -> "Sechse"
            7 -> "Siebne"
            8 -> "Åchte"
            9 -> "Nëine"
            10 -> "Zehne"
            11 -> "Elfe"
            12 -> "Zwölfe"
            else -> ""
        }
    }

    private fun getMinute(): String {
        if (minute in 1..29) {
            return when (minute) {
                1 -> "Oans"
                2 -> "Zwoa"
                3 -> "Drei"
                4 -> "Vier"
                5 -> "Fünf"
                6 -> "Sechs"
                7 -> "Siebn"
                8 -> "Åcht"
                9 -> "Nëin"
                10 -> "Zehn"
                11 -> "Elf"
                12 -> "Zwölf"
                13 -> "Dreizehn"
                14 -> "Vierzehn"
                15 -> "Viertl nåch"
                16 -> "Sechzehn"
                17 -> "Siebzehn"
                18 -> "Åchtzehn"
                19 -> "Nëinzehn"
                20 -> "Zwanzig"
                21 -> "Oanezwanzig"
                22 -> "Zwoaezwanzig"
                23 -> "Dreiezwanzig"
                24 -> "Vierezwanzig"
                25 -> "Fünfezwanzig"
                26 -> "Sechsezwanzig"
                27 -> "Siebnezwanzig"
                28 -> "Åchtezwanzig"
                29 -> "Nëinezwanzig"
                else -> ""
            } + " nåch "
        } else if (minute == 30) {
            return "Hålbe "
        } else if (minute == 0) {
            return ""
        } else {
            return when (minute) {
                31 -> "Oans nåch hålbe "
                32 -> "Zwoa nåch hålbe "
                33 -> "Drei nåch hålbe "
                34 -> "Vier nåch hålbe "
                35 -> "Fünf nåch hålbe "
                36 -> "Sechs nåch hålbe "
                37 -> "Siebn nåch hålbe "
                38 -> "Åcht nåch hålbe "
                39 -> "Nëin nåch hålbe "
                40 -> "Zwanzig vor "
                41 -> "Nëinzehn vor "
                42 -> "Åchtzehn vor "
                43 -> "Siebzehn vor "
                44 -> "Sechzehn vor "
                45 -> "Dreiviertl af "
                46 -> "Vierzehn vor "
                47 -> "Dreizehn vor "
                48 -> "Zwölf vor "
                49 -> "Elf vor "
                50 -> "Zehn vor "
                51 -> "Nëin vor "
                52 -> "Åcht vor "
                53 -> "Siebn vor "
                54 -> "Sechs vor "
                55 -> "Fünf vor "
                56 -> "Vier vor "
                57 -> "Drei vor "
                58 -> "Zwoa vor "
                59 -> "Oans vor "
                else -> ""
            }
        }
    }

    fun getTextualTime(): String {
        if (minute == 0) {
            when (hour) {
                0 -> return "Mitternåcht"
                12 -> return "Mittåg"
            }
        }

        return "${getMinute()}${getHour()}"
    }
}