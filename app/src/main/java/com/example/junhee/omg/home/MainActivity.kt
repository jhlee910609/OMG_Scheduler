package com.example.junhee.omg.home

import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import com.example.junhee.omg.R
import com.example.junhee.omg.utils.obtainViewModel
import com.example.junhee.omg.utils.replaceFragmentInActivity
import com.example.junhee.omg.utils.setupActionBar

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupActionBar(R.id.toolbar) {
            setHomeAsUpIndicator(R.drawable.ic_menu)
            setDisplayHomeAsUpEnabled(true)
            setTitle(R.string.main_title)
        }

        viewModel = obtainViewModel().apply {
        }

        setupViewFragment()

    }

    fun obtainViewModel(): MainViewModel = obtainViewModel(MainViewModel::class.java)

    private fun setupViewFragment(){
        supportFragmentManager.findFragmentById(R.id.content_frame) ?:
                MainFragment.newInstance().let {
                    replaceFragmentInActivity(it, R.id.content_frame)
                }
    }
}
