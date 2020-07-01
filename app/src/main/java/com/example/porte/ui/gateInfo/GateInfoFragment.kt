package com.example.porte.ui.gateInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.porte.R
import kotlinx.android.synthetic.main.fragment_gate_info.view.*

class GateInfoFragment : Fragment() {
        override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
        ): View? {
                val root = inflater.inflate(R.layout.fragment_gate_info, container, false)
                root.goTo2.setOnClickListener{
                        findNavController().navigate(R.id.action_navigation_gateInfo_to_gateInfo23)
                }
                return root
        }
}
