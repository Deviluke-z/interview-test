package duc.daominh.interview_test.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import duc.daominh.interview_test.R
import duc.daominh.interview_test.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

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
        val selected_country = args.selectedCountry

        Glide.with(binding.root)
            .load(selected_country.flags.png)
            .placeholder(R.drawable.unavailable_image)
            .into(binding.ivFlagsImage)

        binding.tvCommonName.text = selected_country.name.common
        binding.tvOfficialName.text = selected_country.name.official
        binding.tvNativeName.text = selected_country.name.nativeName.vie.common
        binding.tvCapitalName.text = selected_country.capital[0]
        binding.tvRegionName.text = selected_country.region
        binding.tvTimezoneName.text = selected_country.timezones[0]

        Glide.with(binding.root)
            .load(selected_country.coatOfArms.png)
            .placeholder(R.drawable.unavailable_image)
            .into(binding.ivCOAImage)
    }
}