package duc.daominh.interview_test.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import duc.daominh.interview_test.InterviewTestApplication
import duc.daominh.interview_test.R
import duc.daominh.interview_test.databinding.FragmentBookmarkedBinding
import duc.daominh.interview_test.presentation.adapter.SavedCountryAdapter
import duc.daominh.interview_test.presentation.viewmodel.MainViewModel
import kotlinx.coroutines.launch

class BookmarkedFragment : Fragment() {

    private lateinit var binding: FragmentBookmarkedBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var savedCountryAdapter: SavedCountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bookmarked, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        savedCountryAdapter = (activity as MainActivity).savedCountryAdapter

        lifecycleScope.launch {
            setupAdapter()
            getAllSavedCountry()
        }
    }

    private fun getAllSavedCountry() {
        viewModel.getAllSavedCountryFromDB().observe(viewLifecycleOwner, Observer { response ->
            savedCountryAdapter.differList.submitList(response)
        })
    }

    private fun setupAdapter() {
        binding.rvListCountry.apply {
            adapter = savedCountryAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
        savedCountryAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("selected_country", it)
            }
            Log.d(InterviewTestApplication.DEBUG_TAG, "bundle sent: $bundle")
            findNavController().navigate(R.id.action_bookmarkedFragment_to_detailsFragment, bundle)
        }
    }
}