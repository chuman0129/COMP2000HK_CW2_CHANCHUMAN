package com.example.chanchuman_ex5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chanchuman_ex5.databinding.FragmentSecondBinding
import com.example.chanchuman_ex5.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button_first3.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_FirstFragment)
        }

        binding.button_first2.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_FirstFragment)
        }

        binding.button_first5.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}