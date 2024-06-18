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

class SavedCountryAdapter : RecyclerView.Adapter<SavedCountryAdapter.SavedCountryViewHolder>() {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedCountryViewHolder {
        val binding = CountryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SavedCountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SavedCountryViewHolder, position: Int) {
        holder.bind(differList.currentList[position])
    }

    override fun getItemCount(): Int {
        return differList.currentList.size
    }

    inner class SavedCountryViewHolder(val view: CountryItemBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(country: CountryDetailsModel) {
            view.tvOfficialName.text = country.name.official
            view.tvCommonName.text = country.name.common
            view.tvNativeName.text = country.name.nativeName.vie.common
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