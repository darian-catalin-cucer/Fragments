package cucerdariancatalin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cucerdariancatalin.fragments.FavoriteFragment
import cucerdariancatalin.fragments.HomeFragment
import cucerdariancatalin.fragments.R
import cucerdariancatalin.fragments.SettingsFragment
import cucerdariancatalin.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoriteFragment(), "Favorites")
        adapter.addFragment(SettingsFragment(), "Settings")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)


        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }
}