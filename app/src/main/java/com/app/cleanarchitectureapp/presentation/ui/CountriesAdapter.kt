package com.app.cleanarchitectureapp.presentation.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.cleanarchitectureapp.R

class CountriesAdapter(val mContex: Context, val mCountries: List<String>) :
    RecyclerView.Adapter<CountriesAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val tvCountryName: TextView = itemView.findViewById(R.id.tvName)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_country, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvCountryName.text = mCountries[position]
    }

    override fun getItemCount(): Int {
        return mCountries.size
    }

}