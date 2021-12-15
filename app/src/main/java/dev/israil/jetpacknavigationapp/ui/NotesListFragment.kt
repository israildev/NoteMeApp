package dev.israil.jetpacknavigationapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.israil.jetpacknavigationapp.R
import kotlinx.android.synthetic.main.fragment_my_second.*

class NotesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_to_third.setOnClickListener {
            findNavController().navigate(R.id.action_mySecondFragment_to_myThirdFragment)
        }
    }

}