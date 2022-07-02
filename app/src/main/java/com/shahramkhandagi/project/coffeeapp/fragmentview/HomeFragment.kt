package com.shahramkhandagi.project.coffeeapp.fragmentview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        val adapter = CategoriesAdapter(activity!!)
        categoriesRecyclerView.adapter = adapter
        categoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL, false)


    }

}