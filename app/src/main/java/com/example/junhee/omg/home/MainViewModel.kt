package com.example.junhee.omg.home

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableList
import android.widget.Toast
import com.example.junhee.omg.SingleLiveEvent

/**
 * Created by JunHee on 2018. 3. 25..
 */
class MainViewModel(val context: Application
) : AndroidViewModel(context) {

    val items: ObservableList<String> = ObservableArrayList()
    val count = ObservableBoolean(false)
    val snackBarMsg = SingleLiveEvent<String>()
    val openItem = SingleLiveEvent<Int>()

    fun showSnackBar(message: String){
       Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun loadItems(){

    }
}