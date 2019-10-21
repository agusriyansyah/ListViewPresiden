package com.example.listviewpresiden

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresiden.Adapter.ListAdapterPresiden
import com.example.listviewpresiden.Model.DataPresiden
import com.example.listviewpresiden.Model.ModelList
import com.example.listviewpresiden.R.id.list_presiden

class   MainActivity : AppCompatActivity() {
    private lateinit var rvIcon: RecyclerView
    private var list: ArrayList<ModelList> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvIcon = findViewById(list_presiden)
        rvIcon.setHasFixedSize(true)
        list.addAll(DataPresiden.listModelList)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvIcon.layoutManager = LinearLayoutManager(this)
        rvIcon.adapter = ListAdapterPresiden(this,list){
            Toast.makeText(this,it.data,Toast.LENGTH_SHORT).show();
        }
    }
}
