package com.unidev.data.objects.api

import com.google.gson.annotations.SerializedName

class ApiListResult<TYPE> {
    @SerializedName("message")
    var message = ""

    @SerializedName("cod")
    var cod = ""

    @SerializedName("count")
    var count = 0

    @SerializedName("list")
    var list = emptyList<TYPE>()
}