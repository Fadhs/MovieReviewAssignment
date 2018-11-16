package com.example.fadhs.moviereview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.movierater.*


class MovieRater : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movierater)

        val extras = intent.extras?: return

        val title = extras.getString("Title")
        val overview = extras.getString("Overview")
        val language = extras.getString ("Language")
        val releaseDate = extras.getString("ReleaseDate")
        val suitable = extras.getString("Suitable")

        viewTitle.text = title.toString()
        viewOverview.text = overview.toString()
        viewLanguage.text = language.toString()
        viewReleaseDate.text = releaseDate.toString()
        viewSuitable.text = suitable.toString()
    }
}