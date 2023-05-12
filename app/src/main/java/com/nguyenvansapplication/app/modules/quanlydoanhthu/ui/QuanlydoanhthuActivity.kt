package com.nguyenvansapplication.app.modules.quanlydoanhthu.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityQuanlydoanhthuBinding
import com.nguyenvansapplication.app.modules.quanlydoanhthu.`data`.viewmodel.QuanlydoanhthuVM
import kotlin.String
import kotlin.Unit

class QuanlydoanhthuActivity :
    BaseActivity<ActivityQuanlydoanhthuBinding>(R.layout.activity_quanlydoanhthu) {
  private val viewModel: QuanlydoanhthuVM by viewModels<QuanlydoanhthuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.quanlydoanhthuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "QUANLYDOANHTHU_ACTIVITY"

  }
}
