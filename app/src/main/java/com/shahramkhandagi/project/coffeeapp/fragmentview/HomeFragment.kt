package com.shahramkhandagi.project.coffeeapp.fragmentview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.shahramkhandagi.project.coffeeapp.CategoriesAdapter
import com.shahramkhandagi.project.coffeeapp.R


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categoriesRecyclerView = view.findViewById<RecyclerView>(R.id.categoriesRecyclerView)
        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)

        val imageSlides: ArrayList<SlideModel> = ArrayList()

        var adapter = CategoriesAdapter(activity!!)
        categoriesRecyclerView.adapter = adapter
        categoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL, false)


        imageSlides.add(SlideModel("https://wallpapers.com/images/high/coffee-latte-round-table-z0kwliy7va3a2xaj.jpg", ScaleTypes.FIT))
        imageSlides.add(SlideModel("https://wallpapers.com/images/high/frothy-coffee-mandala-design-gba05ob00xdbi7h7.jpg", ScaleTypes.FIT))
        imageSlides.add(SlideModel("https://wallpapers.com/images/high/coffee-beans-black-coffee-gj48fbsyuaxssf0o.jpg", ScaleTypes.FIT))
        imageSlides.add(SlideModel("https://wallpapers.com/images/high/cappuccino-coffee-bean-plate-2sm3tu9800qvb0uo.jpg", ScaleTypes.FIT))

        imageSlider.setImageList(imageSlides, ScaleTypes.FIT)


    }

}