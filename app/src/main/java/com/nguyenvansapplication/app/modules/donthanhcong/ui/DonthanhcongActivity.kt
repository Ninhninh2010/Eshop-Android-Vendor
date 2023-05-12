package com.nguyenvansapplication.app.modules.donthanhcong.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityDonthanhcongBinding
import com.nguyenvansapplication.app.modules.donthanhcong.`data`.viewmodel.DonthanhcongVM
import kotlin.String
import kotlin.Unit

class DonthanhcongActivity :
    BaseActivity<ActivityDonthanhcongBinding>(R.layout.activity_donthanhcong) {
  private val viewModel: DonthanhcongVM by viewModels<DonthanhcongVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.donthanhcongVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DONTHANHCONG_ACTIVITY"

  }
}
