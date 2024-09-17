package com.example.shaba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [LogginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Loggin : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) { //es como un constructor
        super.onCreate(savedInstanceState) //se  utiliza para invocar la activity o  fragmento para que sea lo primero que se ejecute

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.loggin_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.logginBtn).setOnClickListener{
            findNavController().navigate(R.id.action_loggin_to_home2)
        }
    }


}