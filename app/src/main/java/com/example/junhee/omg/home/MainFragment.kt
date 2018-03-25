package com.example.junhee.omg.home


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.junhee.omg.databinding.MainFragmentBinding


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    lateinit var viewBinding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewBinding = MainFragmentBinding.inflate(inflater, container, false).apply {
            viewmodel = (activity as MainActivity).obtainViewModel()
        }
        return viewBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewBinding.viewmodel?.let {

        }
    }

    override fun onResume() {
        super.onResume()
        viewBinding.viewmodel?.showSnackBar("Welcome!")
    }
}// Required empty public constructor
