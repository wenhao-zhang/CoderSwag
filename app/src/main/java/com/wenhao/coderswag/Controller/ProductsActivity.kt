package com.wenhao.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wenhao.coderswag.R
import com.wenhao.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        intent.getStringExtra(EXTRA_CATEGORY)
    }
}
