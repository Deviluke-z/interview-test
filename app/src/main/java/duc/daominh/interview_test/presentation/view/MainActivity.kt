package duc.daominh.interview_test.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import duc.daominh.interview_test.R
import duc.daominh.interview_test.databinding.ActivityMainBinding
import duc.daominh.interview_test.presentation.adapter.ListAllCountryAdapter
import duc.daominh.interview_test.presentation.adapter.SearchedCountryAdapter
import duc.daominh.interview_test.presentation.viewmodel.MainViewModel
import duc.daominh.interview_test.presentation.viewmodel.MainViewModelFactory
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: MainViewModelFactory

    @Inject
    lateinit var listAllCountryAdapter: ListAllCountryAdapter

    @Inject
    lateinit var searchedCountryAdapter: SearchedCountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        viewModel =
            ViewModelProvider(this@MainActivity, viewModelFactory)[MainViewModel::class.java]

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcvMain) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bnvMain.setupWithNavController(navController)
    }
}