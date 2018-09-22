package com.hackthealps.paylocal.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hackthealps.paylocal.R
import com.hackthealps.paylocal.model.AccommodationModel
import kotlinx.android.synthetic.main.catalogue_list_item_view.view.*

class ItemsAdapterAdapter(private val context: Context, private val values: List<AccommodationModel>, private val listener: ItemClickListener) : RecyclerView.Adapter<ItemsAdapterAdapter.ViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.accommodation_list_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(values[position], listener)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryName: TextView = itemView.category_name
        private val image: ImageView = itemView.media_image

        fun bind(accommodationModel: AccommodationModel, listener: ItemClickListener) {
            categoryName.text = accommodationModel.title
            itemView.setOnClickListener {
                listener.onItemClick(accommodationModel)
            }
        }
    }

    interface ItemClickListener {
        fun onItemClick(accommodationModel: AccommodationModel)
    }
}