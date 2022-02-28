package com.example.getzeals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OfferAdapter(private val arraylist: List<OfferModel>) :
    RecyclerView.Adapter<OfferAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.offerlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arraylist[position])
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    //when app launch view are displayed in recyclerview
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(offer: OfferModel) {

            val imgOffer = itemView.findViewById(R.id.offerImg) as ImageView
            val tvOfferadd = itemView.findViewById(R.id.tvOfferAddress) as TextView
            val tvOffername = itemView.findViewById(R.id.tvOfferName) as TextView
            imgOffer.setImageResource(offer.img)
            tvOfferadd.text = offer.offeradd
            tvOffername.text = offer.offername
        }
    }
}