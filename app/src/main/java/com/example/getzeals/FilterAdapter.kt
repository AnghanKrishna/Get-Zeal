package com.example.getzeals

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FilterAdapter :
    RecyclerView.Adapter<FilterAdapter.ViewHolder>() {

    lateinit var listener: OnItemClicked
    private var arraylist: List<FilterModel> = arrayListOf()
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.filter_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arraylist[position], position)
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    //    when app launch view are displayed in recyclerview with diff color
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(filter: FilterModel, position: Int) {

            val tvFilter = itemView.findViewById(R.id.tvFilter) as TextView
            val cvFilter = itemView.findViewById(R.id.cvFilter) as CardView
            tvFilter.text = filter.filterName

//          set bgcolor of selected card at runtime
            cvFilter.setBackgroundResource(
                if (filter.isClicked)
                    R.drawable.bg_card_pink
                else
                    R.drawable.bg_card_white
            )

            tvFilter.setOnClickListener {
                listener.itemClicked(position)
            }
        }
    }

    //    function to set data as per filter
    fun setupListener(listener: OnItemClicked) {
        this.listener = listener
    }

    //    interface onItemClicked
    interface OnItemClicked {
        fun itemClicked(position: Int)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateFilter(arraylist: List<FilterModel>) {
        this.arraylist = arraylist
        notifyDataSetChanged()
    }
}