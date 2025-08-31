package com.mizulegendsstudios.mizunexus

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : FragmentActivity() {

    private val clockFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reloj en tiempo real
        val clock = findViewById<TextView>(R.id.clock)
        clock.post(object : Runnable {
            override fun run() {
                clock.text = clockFormat.format(Date())
                clock.postDelayed(this, 1000)
            }
        })

        // Lista de apps lanzables
        val apps = packageManager.queryIntentActivities(
            Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER),
            0
        )

        val grid = findViewById<RecyclerView>(R.id.apps_grid)
        grid.layoutManager = GridLayoutManager(this, 4)
        grid.adapter = AppAdapter(apps) { app ->
            val intent = packageManager.getLaunchIntentForPackage(
                app.activityInfo.packageName
            )
            startActivity(intent)
        }
    }
}