package com.wenhao.coderswag.Services

import com.wenhao.coderswag.Model.Category
import com.wenhao.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1", "Beanie with Devslope logo"),
        Product("Devslopes Hat Black", "$20", "hat2", "A black hat"),
        Product("Devslopes Hat White", "$20", "hat3", "A white hat"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "A snapback"),
        Product("Devslopes Graphic Beanie", "$18", "hat1", "Beanie with Devslope logo"),
        Product("Devslopes Hat Black", "$20", "hat2", "A black hat"),
        Product("Devslopes Hat White", "$20", "hat3", "A white hat"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "A snapback"),
        Product("Devslopes Graphic Beanie", "$18", "hat1", "Beanie with Devslope logo"),
        Product("Devslopes Hat Black", "$20", "hat2", "A black hat"),
        Product("Devslopes Hat White", "$20", "hat3", "A white hat"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "A snapback")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1", "Gray hoodie with Devslopes logo"),
        Product("Devslopes Hoodie Red","$32","hoodie2", "Red hoodie with Devslopes logo"),
        Product("Devslopes Gray Hoodie","$28","hoodie3", "Gray hoodie"),
        Product("Devslopes Black Hoodie","$32","hoodie4", "Black hoodie with Devslopes logo"),
        Product("Devslopes Hoodie Gray","$28","hoodie1", "Gray hoodie with Devslopes logo"),
        Product("Devslopes Hoodie Red","$32","hoodie2", "Red hoodie with Devslopes logo"),
        Product("Devslopes Gray Hoodie","$28","hoodie3", "Gray hoodie"),
        Product("Devslopes Black Hoodie","$32","hoodie4", "Black hoodie with Devslopes logo"),
        Product("Devslopes Hoodie Gray","$28","hoodie1", "Gray hoodie with Devslopes logo"),
        Product("Devslopes Hoodie Red","$32","hoodie2", "Red hoodie with Devslopes logo"),
        Product("Devslopes Gray Hoodie","$28","hoodie3", "Gray hoodie"),
        Product("Devslopes Black Hoodie","$32","hoodie4", "Black hoodie with Devslopes logo")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1", "Black shirt with Deveslopes logo"),
        Product("Devslopes Badge Light Gray","$20","shirt2", "Badge light gray shirt with Deveslopes logo"),
        Product("Devslopes Logo Shirt Red","$22","shirt3","Red shirt with Deveslopes logo"),
        Product("Devslopes Hustle","$22","shirt4", "Hustle shirt with Deveslopes logo"),
        Product("Kickflip Studios","$18","shirt5","Kickflip studios shirt with Deveslopes logo"),
        Product("Devslopes Shirt Black","$18","shirt1", "Black shirt with Deveslopes logo"),
        Product("Devslopes Badge Light Gray","$20","shirt2", "Badge light gray shirt with Deveslopes logo"),
        Product("Devslopes Logo Shirt Red","$22","shirt3","Red shirt with Deveslopes logo"),
        Product("Devslopes Hustle","$22","shirt4", "Hustle shirt with Deveslopes logo"),
        Product("Kickflip Studios","$18","shirt5","Kickflip studios shirt with Deveslopes logo"),        Product("Devslopes Shirt Black","$18","shirt1", "Black shirt with Deveslopes logo"),
        Product("Devslopes Badge Light Gray","$20","shirt2", "Badge light gray shirt with Deveslopes logo"),
        Product("Devslopes Logo Shirt Red","$22","shirt3","Red shirt with Deveslopes logo"),
        Product("Devslopes Hustle","$22","shirt4", "Hustle shirt with Deveslopes logo"),
        Product("Kickflip Studios","$18","shirt5","Kickflip studios shirt with Deveslopes logo")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}