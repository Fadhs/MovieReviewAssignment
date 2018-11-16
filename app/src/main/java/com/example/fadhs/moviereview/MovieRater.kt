package com.example.fadhs.moviereview


open class MovieRate(title:String, desc:String, relDate:String, checkedRadioButton:String, suitable:Boolean){
    var title:String
    var desc:String
    var relDate:String
    var checkedRadioButton:String
    var suitable:Boolean

    init {
        this.title = title
        this.desc = desc
        this.relDate = relDate
        this.checkedRadioButton = checkedRadioButton
        this.suitable = suitable
    }


}