package org.jik.notification_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val api = APIS.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.post_btn).setOnClickListener {
            var data = PostModel("컴퓨터공학부","sdfsd2132", keyword = arrayListOf())

            api.post_users(data).enqueue(object : Callback<PostResult> {
                override fun onResponse(call: Call<PostResult>, response: Response<PostResult>) {
                    Log.d("log", response.toString())
                    Log.d("log", response.body().toString())

                }

                override fun onFailure(call: Call<PostResult>, t: Throwable) {
                    Log.d("log", t.message.toString())
                    Log.d("log", "fail")
                }

            })
        }
    }
}