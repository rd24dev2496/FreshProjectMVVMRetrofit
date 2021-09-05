package com.example.freshprojectmvvmretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.freshprojectmvvmretrofit.databinding.AdapterAmiiboBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    var amiibos= mutableListOf<Amiibo>()
    fun setAmiiboList(amiibos: List<Amiibo>)
    {
        this.amiibos=amiibos.toMutableList()
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterAmiiboBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val amiibo=amiibos[position]
        holder.binding.amiiboSeries.text = amiibo.amiiboSeries
        holder.binding.character.text = amiibo.character
        holder.binding.gameSeries.text = amiibo.gameSeries
        holder.binding.head.text = amiibo.head
        holder.binding.name.text = amiibo.name
        Glide.with(holder.itemView.context).load(amiibo.imageUrl).into(holder.binding.imageview)

    }
    override fun getItemCount(): Int {
        return amiibos.size
    }
    class MainViewHolder(val binding: AdapterAmiiboBinding):RecyclerView.ViewHolder(binding.root){

    }
}
