package com.wenhao.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wenhao.coderswag.Model.Product
import com.wenhao.coderswag.R
import com.wenhao.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice.text = product.price
        productDescription.text = product.description
    }
}
