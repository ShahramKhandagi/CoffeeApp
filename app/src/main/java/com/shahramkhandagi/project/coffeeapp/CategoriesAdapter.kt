package com.shahramkhandagi.project.coffeeapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.*
import java.util.concurrent.Executors
import kotlin.Comparator
import kotlin.collections.ArrayList

class CategoriesAdapter(
    private val context: Context
) : RecyclerView.Adapter<CategoriesAdapter.ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_list_item, parent, false)

        return ItemHolder(inflate)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        Glide.with(context).load(R.drawable.cappuccino).into(holder.productPicture)

    }

    override fun getItemCount(): Int {
        return 4
    }


    class ItemHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        val productPicture = v.findViewById<ImageView>(R.id.productPicture)

        override fun onClick(p0: View?) {

        }

    }
}
