package duc.daominh.interview_test.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import duc.daominh.interview_test.R
import duc.daominh.interview_test.data.model.CountryDetailsModel
import duc.daominh.interview_test.databinding.CountryItemBinding

class SearchedCountryAdapter :
    RecyclerView.Adapter<SearchedCountryAdapter.SearchedCountryViewHolder>() {

    private val callback = object : DiffUtil.ItemCallback<CountryDetailsModel>() {
        override fun areItemsTheSame(
            oldItem: CountryDetailsModel,
            newItem: CountryDetailsModel
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: CountryDetailsModel,
            newItem: CountryDetailsModel
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differList = AsyncListDiffer(this, callback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchedCountryViewHolder {
        val binding = CountryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SearchedCountryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differList.currentList.size
    }

    override fun onBindViewHolder(holder: SearchedCountryViewHolder, position: Int) {
        holder.bind(differList.currentList[position])
    }

    inner class SearchedCountryViewHolder(val view: CountryItemBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(country: CountryDetailsModel) {
            view.tvOfficialName.text = country.name.official
            view.tvNativeName.text = country.name.nativeName.vie.common
            view.tvCommonName.text = country.name.common
            Glide.with(view.ivFlagsImage.context)
                .load(country.flags.png)
                .placeholder(R.drawable.unavailable_image)
                .into(view.ivFlagsImage)

            view.root.setOnClickListener {
                onItemClickListener?.let {
                    it(country)
                }
            }
        }
    }

    private var onItemClickListener: ((CountryDetailsModel) -> Unit)? = null

    fun setOnItemClickListener(listener: (CountryDetailsModel) -> Unit) {
        onItemClickListener = listener
    }
}