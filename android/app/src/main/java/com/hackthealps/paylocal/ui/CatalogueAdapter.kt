package com.hackthealps.paylocal.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hackthealps.paylocal.R
import com.hackthealps.paylocal.model.Category
import kotlinx.android.synthetic.main.catalogue_list_item_view.view.*

class CatalogueAdapter(private val context: Context, private val values: List<Category>, private val listener: ItemClickListener) : RecyclerView.Adapter<CatalogueAdapter.ViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.catalogue_list_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(values[position], listener)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryName: TextView = itemView.category_name
        private val image: ImageView = itemView.media_image

        fun bind(category: Category, listener: ItemClickListener) {
            categoryName.text = category.name
            image.setImageDrawable(context.getDrawable(category.imageId))
            itemView.setOnClickListener {
                listener.onItemClick(category)
            }
        }
    }

    interface ItemClickListener {
        fun onItemClick(category: Category)
    }
}