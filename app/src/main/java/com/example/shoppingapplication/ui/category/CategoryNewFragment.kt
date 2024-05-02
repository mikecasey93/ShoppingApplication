package com.example.shoppingapplication.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentHomeBinding

class CategoryNewFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    //lateinit var viewModel: CategoryNewViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this).get(CategoryNewViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        //val textView: TextView = binding.textView2
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            //textView.text = it
//        }
        val cardView: CardView = binding.fruits
        cardView.setOnClickListener{
            findNavController().navigate(R.id.action_nav_category_to_nav_listFragment)
        }
        return root
    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
////        viewModel = ViewModelProvider(this)[CategoryNewViewModel::class.java]
////        val cardView: CardView = binding.fruits
////        cardView.setOnClickListener{
////            findNavController().navigate(R.id.action_nav_category_to_nav_listFragment)
////        }
//    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}