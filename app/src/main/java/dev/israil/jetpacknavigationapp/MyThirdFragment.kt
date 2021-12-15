package dev.israil.jetpacknavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_my_third.*

class MyThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_to_home.setOnClickListener {
            findNavController().navigate(R.id.action_myThirdFragment_to_myHomeFragment3)
        }
        btn_to_second.setOnClickListener {
            findNavController().navigate(R.id.action_myThirdFragment_to_mySecondFragment)
        }
    }


}