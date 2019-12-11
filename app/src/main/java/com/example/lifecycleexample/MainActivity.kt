package com.example.lifecycleexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycleexample.ui.main.PlaceholderFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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


        open.setOnClickListener { openActivity() }
        add.setOnClickListener { onAdd() }
        replace.setOnClickListener { onreplace() }
    }

    private fun onreplace() {
        log("add: FrgamentListCount " + supportFragmentManager.backStackEntryCount + " BackstackCount " + supportFragmentManager.backStackEntryCount )

        supportFragmentManager.beginTransaction().replace(R.id.container,PlaceholderFragment()).commit()
    }

    private fun onAdd() {

        log("add: FrgamentListCount " + supportFragmentManager.backStackEntryCount + " BackstackCount " + supportFragmentManager.backStackEntryCount )

        supportFragmentManager.beginTransaction().add(R.id.container,PlaceholderFragment()).commit()
    }

    private fun openActivity() {
        startActivity(Intent(this, MainActivity2::class.java))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        log("onSaveInstanceState")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        log("onNewIntent")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        log("onNewIntent")
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
        Log.w(TAG, "Activity One " + value)
    }

}