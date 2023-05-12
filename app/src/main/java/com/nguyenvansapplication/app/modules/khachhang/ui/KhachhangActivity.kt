package com.nguyenvansapplication.app.modules.khachhang.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityKhachhangBinding
import com.nguyenvansapplication.app.modules.khachhang.`data`.viewmodel.KhachhangVM
import kotlin.String
import kotlin.Unit

class KhachhangActivity : BaseActivity<ActivityKhachhangBinding>(R.layout.activity_khachhang) {
  private val viewModel: KhachhangVM by viewModels<KhachhangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.khachhangVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "KHACHHANG_ACTIVITY"

  }
}
