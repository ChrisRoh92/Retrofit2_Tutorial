package de.app.retrofit2_tutorial.data

import com.google.gson.annotations.SerializedName

data class University(
    @SerializedName("state-province")
    var stateprovince :String,
    @SerializedName("country")
    var country:String,
    @SerializedName("name")
    var name:String,
    @SerializedName("web_pages")
    var webPages:Array<String>,
    @SerializedName("domains")
    var domains:Array<String>,
    @SerializedName("alpha_two_code")
    var alpha_two_code:String
)