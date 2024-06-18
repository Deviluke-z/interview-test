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
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import duc.daominh.interview_test.InterviewTestApplication.Companion.DEBUG_TAG
import duc.daominh.interview_test.InterviewTestApplication.Companion.INTERNET_NOT_AVAILABLE_MESSAGE
import duc.daominh.interview_test.R
import duc.daominh.interview_test.data.modelJson.toModel
import duc.daominh.interview_test.data.util.Resource
import duc.daominh.interview_test.databinding.FragmentHomeBinding
import duc.daominh.interview_test.presentation.adapter.ListAllCountryAdapter
import duc.daominh.interview_test.presentation.viewmodel.MainViewModel
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var listAllCountryAdapter: ListAllCountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        listAllCountryAdapter = (activity as MainActivity).listAllCountryAdapter

        lifecycleScope.launch {
            setupAdapter()
            fetchCountryListFromRemote()
        }
    }

    private suspend fun fetchCountryListFromRemote() {
        Log.d(DEBUG_TAG, "HomeFragment: fetchCountryListFromRemote()")
        viewModel.fetchCountryListFromRemote()
        viewModel.allCountryList.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    Log.d(DEBUG_TAG, "HomeFragment: fetchCountryListFromRemote(): Success")
                    response.data?.let { data ->
                        val result = data.map {
                            it.toModel()
                        }.let { ArrayList(it) }
                        listAllCountryAdapter.differList.submitList(result)
                    }
                }

                is Resource.Failure -> {
                    Log.d(DEBUG_TAG, "HomeFragment: fetchCountryListFromRemote(): Failure")
                    response.message.let {
                        Log.d(DEBUG_TAG, it.toString())
                        Snackbar.make(
                            requireContext(),
                            binding.root,
                            it.toString(),
                            Snackbar.LENGTH_SHORT
                        ).show()
                    }
                }

                is Resource.Loading -> {
                    Log.d(DEBUG_TAG, "HomeFragment: fetchCountryListFromRemote(): Loading")
                }
            }

        })
    }

    private fun setupAdapter() {
        binding.rvListCountry.apply {
            adapter = listAllCountryAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }
}