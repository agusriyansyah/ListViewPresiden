package com.example.listviewpresiden.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresiden.Model.DataPresiden.listModelList
import com.example.listviewpresiden.Model.ModelList
import com.example.listviewpresiden.R

class ListAdapterPresiden (private val ListPresiden: Context, private val modelList : ArrayList<ModelList>, private val listener: (ModelList) -> Unit)
    : RecyclerView.Adapter<ListAdapterPresiden.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(ListPresiden).inflate(R.layout.row_list_presiden, parent, false))
    }

    override fun getItemCount(): Int {
        return listModelList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindIcon(modelList[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.nama_presiden)
        var tvData: TextView = view.findViewById(R.id.deskripsi_presiden)
        var imgPoster: ImageView = view.findViewById(R.id.img_presdien)

        fun bindIcon(modelList: ModelList, listener: (ModelList) -> Unit){
            tvName.text = modelList.name
            Glide.with(itemView.context)
                .load(modelList.poster)
                .into(imgPoster)

            itemView.setOnClickListener{
                listener(modelList)
            }
        }
    }
}

