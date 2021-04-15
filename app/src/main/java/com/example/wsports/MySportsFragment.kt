package com.example.wsports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.wsports.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private lateinit var binding: FragmentMySportsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_my_sports, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mySportsButton.setOnClickListener {
            val action =
                MySportsFragmentDirections.actionMySportsFragmentToMyFavoriteSportsFragment()
            findNavController().navigate(action)
        }
    }

}