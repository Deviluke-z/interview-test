package duc.daominh.interview_test.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import duc.daominh.interview_test.InterviewTestApplication.Companion.DEBUG_TAG
import duc.daominh.interview_test.R
import duc.daominh.interview_test.databinding.FragmentDetailsBinding
import duc.daominh.interview_test.presentation.viewmodel.MainViewModel

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: DetailsFragmentArgs by navArgs()
        val selectedCountry = args.selectedCountry

        Glide.with(binding.root)
            .load(selectedCountry.flags.png)
            .placeholder(R.drawable.unavailable_image)
            .into(binding.ivFlagsImage)

        binding.tvCommonName.text = selectedCountry.name.common
        binding.tvOfficialName.text = selectedCountry.name.official
        binding.tvNativeName.text = selectedCountry.name.nativeName.vie.common
        binding.tvCapitalName.text = selectedCountry.capital[0]
        binding.tvRegionName.text = selectedCountry.region
        binding.tvTimezoneName.text = selectedCountry.timezones[0]

        Glide.with(binding.root)
            .load(selectedCountry.coatOfArms.png)
            .placeholder(R.drawable.unavailable_image)
            .into(binding.ivCOAImage)

        viewModel = (activity as MainActivity).viewModel

        binding.btnSave.setOnClickListener {
            viewModel.saveCountryToDB(selectedCountry)
            Log.d(DEBUG_TAG, "Saved Successfully!")
        }
    }

    private fun getArgs() {

    }
}