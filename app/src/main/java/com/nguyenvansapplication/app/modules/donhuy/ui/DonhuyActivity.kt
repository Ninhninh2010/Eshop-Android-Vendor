package com.nguyenvansapplication.app.modules.donhuy.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityDonhuyBinding
import com.nguyenvansapplication.app.modules.donhuy.`data`.viewmodel.DonhuyVM
import kotlin.String
import kotlin.Unit

class DonhuyActivity : BaseActivity<ActivityDonhuyBinding>(R.layout.activity_donhuy) {
  private val viewModel: DonhuyVM by viewModels<DonhuyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.donhuyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DONHUY_ACTIVITY"

  }
}
