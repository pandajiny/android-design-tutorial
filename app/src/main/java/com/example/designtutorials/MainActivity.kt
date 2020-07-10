package com.example.designtutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.designtutorials.viewpager2.ViewPagerActivity
import kotlinx.android.synthetic.main.activity_swipe_tab.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().add(R.id.mainLayout, CollectionDemoFragment())
//            .commit()


        startActivity(Intent(this, ViewPagerActivity::class.java))
    }
}