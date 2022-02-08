package com.example.viewvideo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video :VideoView = findViewById(R.id.video)

        video.setVideoURI(Uri.parse("https://youtu.be/__-vp0g_BhA"))
        video.requestFocus()
        video.start()

        button.setOnClickListener {
            video.start()
        }
    }
}