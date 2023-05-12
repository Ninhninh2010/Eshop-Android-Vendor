package com.nguyenvansapplication.app.modules.mainshop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainshopBinding
import com.nguyenvansapplication.app.modules.mainshop.`data`.viewmodel.MainshopVM
import kotlin.String
import kotlin.Unit

class MainshopActivity : BaseActivity<ActivityMainshopBinding>(R.layout.activity_mainshop) {
  private val viewModel: MainshopVM by viewModels<MainshopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainshopVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MAINSHOP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainshopActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
