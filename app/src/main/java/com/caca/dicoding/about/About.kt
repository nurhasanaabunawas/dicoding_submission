package com.caca.dicoding.about

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.caca.dicoding.R

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgMe: ImageView = findViewById(R.id.img_item_photo)

        val tImg = "https://media-exp1.licdn.com/dms/image/C5603AQH_V3Lg2aPy6w/profile-displayphoto-shrink_200_200/0/1599570733596?e=1617840000&v=beta&t=P1GEu1xPIByS9uu_dMndoTSzX5fRiGmYR70P1HJF1PQ"

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgMe)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
