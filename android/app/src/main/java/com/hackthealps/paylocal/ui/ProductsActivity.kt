package com.hackthealps.paylocal.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import com.hackthealps.paylocal.BuildConfig
import com.hackthealps.paylocal.R
import com.hackthealps.paylocal.api.AccommodationApi
import com.hackthealps.paylocal.model.AccommodationModel
import kotlinx.android.synthetic.main.activity_accommodations.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ProductsActivity : AppCompatActivity(), Callback<List<AccommodationModel>> {

    fun start() {
        val gson = GsonBuilder()
                .setLenient()
                .create()

        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.backendBaseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

        val accommodationApi = retrofit.create(AccommodationApi::class.java)

        val call = accommodationApi.allAccommodations
        call.enqueue(this)
    }

    override fun onResponse(call: Call<List<AccommodationModel>>, response: Response<List<AccommodationModel>>) {
        if (response.isSuccessful) {
            val eventsList = response.body()
            items_list.adapter = ItemsAdapterAdapter(this, eventsList!!, object : ItemsAdapterAdapter.ItemClickListener{
                override fun onItemClick(accommodationModel: AccommodationModel) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            })
        } else {
            println(response.errorBody())
        }
    }

    override fun onFailure(call: Call<List<AccommodationModel>>, t: Throwable) {
        t.printStackTrace()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accommodations)
        start()
        items_list.layoutManager = LinearLayoutManager(this)

    }
}
