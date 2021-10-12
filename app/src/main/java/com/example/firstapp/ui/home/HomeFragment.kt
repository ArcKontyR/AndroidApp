package com.example.firstapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R
import com.example.firstapp.databinding.FragmentHomeBinding
import com.example.firstapp.recadapters.FeelRecycler
import com.example.firstapp.recadapters.Feel
import com.example.firstapp.recadapters.State
import com.example.firstapp.recadapters.StateRecycler

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val feel_recycler: RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), Feel.MyFeel().list)

        val state_recycler: RecyclerView = root.findViewById(R.id.state_rec)
        state_recycler.adapter = StateRecycler(requireContext(), State.MyState().list)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}