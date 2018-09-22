package com.hackthealps.paylocal.ui

import android.animation.ArgbEvaluator
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.hackthealps.paylocal.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {
    private val num_pages = 2
    private lateinit var mainAdapter: FragmentStatePagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAdapter = MainPagerAdapter(supportFragmentManager)
        main_pager.adapter = mainAdapter
        main_pager.addOnPageChangeListener(CustomOnPageChangeListener())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    inner class MainPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getItem(position: Int): Fragment = when (position) {
            0 -> MainFragment()
            1 -> CatalogueFragment()
            else -> error("Page position is not allowed")
        }

        override fun getCount() = num_pages
    }

    inner class CustomOnPageChangeListener : ViewPager.SimpleOnPageChangeListener() {
        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            val pageColors = resources.obtainTypedArray(R.array.page_colors)
            val statusColors = resources.obtainTypedArray(R.array.status_colors)
            var pageColor: Int
            var statusColor: Int
            if (position < mainAdapter.count - 1) {
                pageColor = ArgbEvaluator().evaluate(
                        positionOffset,
                        pageColors.getColor(position, resources.getColor(R.color.mainPageColor)),
                        pageColors.getColor(position + 1, resources.getColor(R.color.cataloguePageColor))) as Int
                statusColor = ArgbEvaluator().evaluate(
                        positionOffset,
                        statusColors.getColor(position, resources.getColor(R.color.mainPageColorDark)),
                        statusColors.getColor(position + 1, resources.getColor(R.color.cataloguePageColorDark))) as Int
                window.statusBarColor = statusColor
            } else {
                pageColor = pageColors.getColor(pageColors.length()-1, resources.getColor(R.color.mainPageColor))
            }
            main_pager.setBackgroundColor(pageColor)
            toolbar.setBackgroundColor(pageColor)
        }
    }
}
