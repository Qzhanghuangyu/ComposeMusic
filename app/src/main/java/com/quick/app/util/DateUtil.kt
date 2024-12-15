package com.quick.app.util

import java.util.Calendar

object DateUtil {
    fun getCurrentYear(): Int {
        return Calendar.getInstance().get(Calendar.YEAR)
    }
}