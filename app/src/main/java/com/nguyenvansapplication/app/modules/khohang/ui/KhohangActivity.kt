package com.nguyenvansapplication.app.modules.khohang.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityKhohangBinding
import com.nguyenvansapplication.app.modules.khohang.`data`.viewmodel.KhohangVM
import kotlin.String
import kotlin.Unit

class KhohangActivity : BaseActivity<ActivityKhohangBinding>(R.layout.activity_khohang) {
  private val viewModel: KhohangVM by viewModels<KhohangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.khohangVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "KHOHANG_ACTIVITY"

  }
}
