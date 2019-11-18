package com.tioeun.a20191118_01_getmethodpractice.datas

import org.json.JSONObject

class User{

    var loginId = ""

    var name = ""

    var phone = ""

    companion object {
        fun getUserFromJson(json:JSONObject) : User {
            var user = User()
            user.loginId = json.getString("login_id")
            user.name = json.getString("name")
            user.phone = json.getString("phone")
            return user
        }
    }
}