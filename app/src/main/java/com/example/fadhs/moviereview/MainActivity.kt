package com.example.fadhs.moviereview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.fadhs.moviereview.R.id.cb2
import com.example.fadhs.moviereview.R.id.cb3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun options (view: View){
        if (cb1.isChecked){
            cb2.visibility = View.VISIBLE
            cb3.visibility = View.VISIBLE
        } else {
            cb2.visibility = View.GONE
            cb3.visibility = View.GONE
        }
    }
    fun btnValidate (view: View) {

        if (movieTitle?.text.isNullOrBlank()){
            movieTitle?.error = "Field empty"
            return
        } else if (movieDesc?.text.isNullOrBlank()){
            movieDesc?.error = "Field empty"
            return
        } else if (relDate?.text.isNullOrBlank()){
            relDate?.error = "Field empty"
            return
        }

    }
}
