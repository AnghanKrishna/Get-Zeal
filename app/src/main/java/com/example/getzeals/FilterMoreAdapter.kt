package com.example.getzeals

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FilterMoreAdapter :
    RecyclerView.Adapter<FilterMoreAdapter.ViewHolder>() {

    private var arraylist: List<FilterMoreModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.filtermore, parent, false)
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
fun updateData(arraylist: List<FilterMoreModel>){
        this.arraylist = arraylist
        notifyDataSetChanged()
    }

//    when app launch view are displayed in recyclerview
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(filtermore: FilterMoreModel) {
            val tvFilterMore = itemView.findViewById(R.id.tvFilterMore) as TextView
            val cbFilter = itemView.findViewById(R.id.cbFilter) as CheckBox
            tvFilterMore.text = filtermore.filterDetail
            cbFilter.isChecked
        }
    }
}