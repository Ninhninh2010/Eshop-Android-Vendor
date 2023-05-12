package com.nguyenvansapplication.app.modules.spash.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivitySpashBinding
import com.nguyenvansapplication.app.modules.mainshop.ui.MainshopActivity
import com.nguyenvansapplication.app.modules.spash.`data`.viewmodel.SpashVM
import kotlin.String
import kotlin.Unit

class SpashActivity : BaseActivity<ActivitySpashBinding>(R.layout.activity_spash) {
  private val viewModel: SpashVM by viewModels<SpashVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.spashVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = MainshopActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPASH_ACTIVITY"

    }
  }
