package duc.daominh.interview_test.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import duc.daominh.interview_test.data.model.CountryModelItem
import duc.daominh.interview_test.databinding.CountryItemBinding

class ListAllCountryAdapter :
    RecyclerView.Adapter<ListAllCountryAdapter.ListAllCountryViewHolder>() {


    private val callback = object : DiffUtil.ItemCallback<CountryModelItem>() {
        override fun areItemsTheSame(
            oldItem: CountryModelItem,
            newItem: CountryModelItem
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: CountryModelItem,
            newItem: CountryModelItem
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differList = AsyncListDiffer(this, callback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAllCountryViewHolder {
        val binding = CountryItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListAllCountryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differList.currentList.size
    }

    override fun onBindViewHolder(holder: ListAllCountryViewHolder, position: Int) {
        holder.bind(differList.currentList[position])
    }

    inner class ListAllCountryViewHolder(val view: CountryItemBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(country: CountryModelItem) {
            view.tvOfficialName.text = country.name.official
            view.ivCommonName.text = country.name.common
            view.tvNativeName.text = country.name.nativeName.vie.common
            Glide.with(view.ivFlagsImage.context)
                .load(country.flags.png)
                .into(view.ivFlagsImage)
        }
    }
}