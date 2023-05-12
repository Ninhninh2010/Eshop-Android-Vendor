package com.nguyenvansapplication.app.modules.quanlydonhang.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityQuanlydonhangBinding
import com.nguyenvansapplication.app.modules.quanlydonhang.`data`.viewmodel.QuanlydonhangVM
import kotlin.String
import kotlin.Unit

class QuanlydonhangActivity :
    BaseActivity<ActivityQuanlydonhangBinding>(R.layout.activity_quanlydonhang) {
  private val viewModel: QuanlydonhangVM by viewModels<QuanlydonhangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.quanlydonhangVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QUANLYDONHANG_ACTIVITY"

  }
}
