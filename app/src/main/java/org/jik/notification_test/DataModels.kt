package org.jik.notification_test

data class PostModel(
        var major: String? = null,
        var token: String? = null,
        var keyword: ArrayList<String>? = null
)

data class PostResult(
    var result:String? = null
)