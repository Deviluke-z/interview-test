package duc.daominh.interview_test.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import duc.daominh.interview_test.InterviewTestApplication
import duc.daominh.interview_test.R
import duc.daominh.interview_test.data.modelJson.toModel
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.databinding.FragmentSearchBinding
import duc.daominh.interview_test.presentation.adapter.SearchedCountryAdapter
import duc.daominh.interview_test.presentation.viewmodel.MainViewModel
import kotlinx.coroutines.launch

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var searchedCountryAdapter: SearchedCountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        searchedCountryAdapter = (activity as MainActivity).searchedCountryAdapter

        lifecycleScope.launch {
            setupAdapter()
            setupSearchView()
        }
    }

    private fun setupAdapter() {
        binding.rcvSearchList.apply {
            adapter = searchedCountryAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
        binding.tvNotFound.visibility = View.INVISIBLE
    }

    private fun setupSearchView() {
        binding.searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                viewModel.fetchCountryBySearch(query.toString())
                updateSearchingResult()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }

    private fun updateSearchingResult() {
        viewModel.countryBySearch.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    Log.d(
                        InterviewTestApplication.DEBUG_TAG,
                        "SearchFragment: updateSearchingResult(): Success"
                    )
                    response.data?.let { data ->
                        val result = data.map {
                            it.toModel()
                        }.let { ArrayList(it) }
                        searchedCountryAdapter.differList.submitList(result)
                    }
                }

                is Resource.Failure -> {
                    Log.d(
                        InterviewTestApplication.DEBUG_TAG,
                        "SearchFragment: updateSearchingResult(): Failure"
                    )
                    response.message.let {
                        Log.d(InterviewTestApplication.DEBUG_TAG, it.toString())
                        Snackbar.make(
                            requireContext(),
                            binding.root,
                            it.toString(),
                            Snackbar.LENGTH_SHORT
                        ).show()
                    }
                }

                is Resource.Loading -> {
                    Log.d(
                        InterviewTestApplication.DEBUG_TAG,
                        "SearchFragment: updateSearchingResult(): Loading"
                    )
                }
            }

        })
    }
}