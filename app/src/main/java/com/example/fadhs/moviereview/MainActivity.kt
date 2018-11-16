package com.example.fadhs.moviereview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set listener
        addanewmovie.setOnClickListener {
            //Action perform when the user clicks on the button.
            val checkedRadioButton = language?.findViewById(language.checkedRadioButtonId) as? RadioButton
            btnValidate()
            Toast.makeText(
        this@MainActivity, "Title = " + movieTitle.text + System.getProperty("line.separator") +
                "Overview = " + movieDesc.text + System.getProperty("line.separator") +
                "Release date = " + relDate.text + System.getProperty("line.separator") +
                "Language = " + "${checkedRadioButton?.text}" + System.getProperty("line.separator") +
                "Not suitable for  all ages = " + cb1.isChecked + System.getProperty("line.separator") +
                "Reason: " +
                cb2.text.toString() + " = " + cb2.isChecked + System.getProperty("line.separator") +
                cb3.text.toString() + " = " + cb3.isChecked, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MovieRater::class.java)
            startActivity(intent)
            MovieRate(movieTitle.text.toString(), movieDesc.text.toString(), relDate.text.toString(), checkedRadioButton?.text.toString(),
                cb1.isChecked )
        }
    }

    fun options (view: View){
        if (cb1.isChecked){
            cb2.visibility = View.VISIBLE
            cb3.visibility = View.VISIBLE
        } else {
            cb2.visibility = View.GONE
            cb2.isChecked = false
            cb3.visibility = View.GONE
            cb3.isChecked = false
        }
    }

    private fun btnValidate () {

        if (movieTitle?.text.isNullOrBlank()){
            movieTitle?.error = "Field empty"
            return
        } else if (movieDesc?.text.isNullOrBlank()){
            movieDesc?.error = "Field empty"
            return
        } else if (relDate?.text.isNullOrBlank()){
            relDate?.error = "Field empty"
            return
        } else if (language?.isSelected == false){
            rb4?.error = "Field empty"
            return
        }

    }
}
