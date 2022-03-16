package com.example.getzeals.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.getzeals.models.FilterMoreModel
import com.example.getzeals.R

class FilterMoreAdapter :
    RecyclerView.Adapter<FilterMoreAdapter.ViewHolder>() {

    private var arraylist: List<FilterMoreModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.filter_more, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arraylist[position])
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    //    update recycler data at run time on filtering
    @SuppressLint("NotifyDataSetChanged")
    fun updateData(arraylist: List<FilterMoreModel>) {
        this.arraylist = arraylist
        notifyDataSetChanged()
    }

    //    when app launch view are displayed in recyclerview
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(filtermore: FilterMoreModel) {

            val tvFilterMore = itemView.findViewById(R.id.tvFilterMore) as TextView
            tvFilterMore.text = filtermore.filterDetail
        }
    }
}