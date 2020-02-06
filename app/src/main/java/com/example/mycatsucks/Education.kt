package com.example.mycatsucks

import java.time.Month
import java.time.Year

class Education (
    val gradUniversityName:String,
    val gradMajor:String,
    val gradMonth: Month,
    val gradYear: Year
    )  : Achievement() {

    override fun update(key: String, newValue: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}