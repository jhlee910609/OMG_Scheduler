package com.example.junhee.omg.home

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by JunHee on 2018. 3. 25..
 */
class MainGalleryAdapter(val items: ArrayList<String>,
                         val taskViewModel: MainViewModel) : RecyclerView.Adapter<MainGalleryAdapter.ImgHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ImgHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun refreshItem(items: ArrayList<String>){
        this.items.clear()
        this.items.addAll(items)
    }

    fun addItem(items: List<String>) {
        this.items.addAll(items)
    }

    inner class ImgHolder(v: View) : RecyclerView.ViewHolder(v) {

        fun bind(url: String){

        }
    }
}