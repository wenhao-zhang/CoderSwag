package com.wenhao.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.wenhao.coderswag.Adapters.ProductAdapter
import com.wenhao.coderswag.R
import com.wenhao.coderswag.Services.DataService
import com.wenhao.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(category))
        productListView.adapter = adapter

        var spanCount = 2;
        val orientation = resources.configuration.orientation

        spanCount = if(orientation == Configuration.ORIENTATION_LANDSCAPE) 3 else spanCount

        val screenSize = resources.configuration.screenWidthDp

        spanCount = if(screenSize > 720) 3 else spanCount

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager

    }
}
