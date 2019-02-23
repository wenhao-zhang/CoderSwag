package com.wenhao.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wenhao.coderswag.Adapters.CategoryAdapter
import com.wenhao.coderswag.R
import com.wenhao.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter


    }
}
