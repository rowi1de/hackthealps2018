package com.hackthealps.paylocal.ui


import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hackthealps.paylocal.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*






class MainFragment : Fragment() {

    val url = "localhost:3333/hta/profile"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener { response ->
                    textView1.text = "Response: %s".format(response.toString())
                },
                Response.ErrorListener { error ->
                    // TODO: Handle error
                }
        )

        val queue = Volley.newRequestQueue(this)

        val view = inflater.inflate(R.layout.fragment_main, container, false)
        (activity as AppCompatActivity).setSupportActionBar(view.toolbar)
//new thread profile json, reactjs, asynctask (obsolete)

        queue.add(jsonObjectRequest)
    return view
    }

}
