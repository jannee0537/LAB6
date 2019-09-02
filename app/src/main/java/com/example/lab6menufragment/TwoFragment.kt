package com.example.lab6menufragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*
import android.widget.Toast as Toast1

/**
 * A simple [Fragment] subclass.
 */
class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragmentTwo.setOnClickListener(){
            val toast = Toast1.makeText(context, "Click On Fragment Two", Toast1.LENGTH_SHORT)
            toast.show()

        }
        return view

    }
}
