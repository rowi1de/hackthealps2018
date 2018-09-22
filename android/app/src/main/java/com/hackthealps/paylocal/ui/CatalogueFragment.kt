package com.hackthealps.paylocal.ui


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hackthealps.paylocal.R
import com.hackthealps.paylocal.controller.AccommodationController
import com.hackthealps.paylocal.controller.EventController
import com.hackthealps.paylocal.controller.GastronomyController
import com.hackthealps.paylocal.model.Category
import kotlinx.android.synthetic.main.fragment_catalogue.view.*

class CatalogueFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_catalogue, container, false)
        val recyclerView = view.catalogue_list
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = CatalogueAdapter(context!!, getCategoryList(), object: CatalogueAdapter.ItemClickListener {
            override fun onItemClick(category: Category) {
                Log.d("CatalogueFragment", category.name)
// TODO open new screen with product lists
                val intent = Intent(context, ProductsActivity::class.java).apply {
                    // TODO send category name
                }
            }
        })

        return view
    }

    // TODO ideally this could be retrieved from the backend
    private fun getCategoryList(): List<Category> {
        val categories = mutableListOf<Category>()
        categories.add(Category("Gastronomy", R.drawable.gastronomy))
        categories.add(Category("Mobility", R.drawable.mobility))
        categories.add(Category("Accommodation", R.drawable.accomodation))
        categories.add(Category("Events", R.drawable.events))

        return categories
    }
}
