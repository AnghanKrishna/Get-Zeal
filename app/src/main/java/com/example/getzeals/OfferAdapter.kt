package com.example.getzeals

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OfferAdapter(private val arraylist: List<OfferModel>) :
    RecyclerView.Adapter<OfferAdapter.ViewHolder>() {

    lateinit var listener:OnItemClicked

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.offer_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arraylist[position],position)
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    //when app launch view are displayed in recyclerview
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(offer: OfferModel,position: Int) {

            val imgOffer = itemView.findViewById(R.id.ivOffer) as ImageView
            val tvOfferadd = itemView.findViewById(R.id.tvOfferAddress) as TextView
            val tvOffername = itemView.findViewById(R.id.tvOfferName) as TextView

//          set runtime diff img in recyclerview
            imgOffer.setImageResource(offer.img)
            tvOfferadd.text = offer.offerAdd
            tvOffername.text = offer.offerName

            imgOffer.setOnClickListener {
                listener.itemClicked(position)
            }

//          passing text to OfferDetailActivity
            val name: String = tvOffername.text.toString()
            val intent = Intent("custom-message")
            intent.putExtra("name", name)

        }
    }

    //    function to set data as per filter
    fun setupListener(listener:OnItemClicked) {
        this.listener = listener
    }

    //    interface onItemClicked
    interface OnItemClicked {
        fun itemClicked(position: Int)
    }
}