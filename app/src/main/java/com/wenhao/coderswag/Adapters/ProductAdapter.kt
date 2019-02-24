package com.wenhao.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.wenhao.coderswag.Model.Product
import com.wenhao.coderswag.R

class ProductAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, viewGroup, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return this.products.count()
    }

    override fun onBindViewHolder(viewHolder: ProductHolder, position: Int) {
        viewHolder.bindProduct(products[position], this.context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            this.productImage.setImageResource(resourceId)
            this.productName.text = product.title
            this.productPrice.text = product.price
        }
    }
}