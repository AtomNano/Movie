package com.example.latbaru.model

import com.example.latbaru.R

data class ModelBuah(
    val image: Int,
    val judul: String
)

object Mocklist{
    fun getModel(): List<ModelBuah>{
        val item1 = ModelBuah(
            image = R.drawable.apple,
            judul = "Apple"
        )
        val item2 = ModelBuah(
            image = R.drawable.pear,
            judul = "pear"
        )
        val item3 = ModelBuah(
            image = R.drawable.grapes,
            judul = "Anggur"
        )
        val item4 = ModelBuah(
            image = R.drawable.orange,
            judul = "Jeruk"
        )
        val item5 = ModelBuah(
            image = R.drawable.strawberry,
            judul = "Strawberry"
        )

        val itemList :ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        return itemList

    }
}