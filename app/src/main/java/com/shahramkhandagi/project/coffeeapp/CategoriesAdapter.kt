package com.shahramkhandagi.project.coffeeapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(
    private val context: Context,
    private val categoriesName: Array<String>,
    private val categoriesPrice: Array<Double>,
    private val categoriesPicture: IntArray
) : RecyclerView.Adapter<CategoriesAdapter.ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_list_item, parent, false)

        return ItemHolder(inflate)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
//        Glide.with(context).load(CategoriesItem().categoriesImage).into(holder.productPicture)

        holder.textViewCoffee.text = categoriesName[position]
        holder.textViewCoffeePrice.text = categoriesPrice[position].toString()
        holder.productPicture.setImageResource(categoriesPicture[position])



    }

    override fun getItemCount(): Int {
        return categoriesName.size
    }


    class ItemHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        val productPicture = v.findViewById<ImageView>(R.id.productPicture)
        val textViewCoffee = v.findViewById<TextView>(R.id.textViewCoffee)
        val textViewCoffeePrice = v.findViewById<TextView>(R.id.textViewCoffeePrice)

        override fun onClick(p0: View?) {

        }

    }
}
