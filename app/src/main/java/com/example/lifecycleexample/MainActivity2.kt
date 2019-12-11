package com.example.lifecycleexample

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    val TAG = "LifeCycleCallBacks"


    override fun onCreate(savedInstanceState: Bundle?) {
        log("onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
//        val viewPager: ViewPager = findViewById(R.id.view_pager)
//        viewPager.adapter = sectionsPagerAdapter
//        val tabs: TabLayout = findViewById(R.id.tabs)
//        tabs.setupWithViewPager(viewPager)
//        val fab: FloatingActionButton = findViewById(R.id.fab)
//
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        log("onCreate")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onAttachedToWindow() {
        log("onAttachedToWindow")
        super.onAttachedToWindow()

    }

    override fun onStart() {
        log("onStart")
        super.onStart()
    }

    override fun onPause() {
        log("onPause")
        super.onPause()
    }

    override fun onResume() {
        log("onResume")
        super.onResume()
    }

    override fun onStop() {
        log("onStop")
        super.onStop()
    }

    override fun onDestroy() {
        log("onDestroy")
        super.onDestroy()
    }

    fun log(value: String) {
        Log.d(TAG, "Activity Two " + value)
    }

}