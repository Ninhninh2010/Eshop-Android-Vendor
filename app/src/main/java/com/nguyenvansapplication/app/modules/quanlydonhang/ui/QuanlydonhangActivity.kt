package com.nguyenvansapplication.app.modules.quanlydonhang.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityQuanlydonhangBinding
import com.nguyenvansapplication.app.modules.donhuy.ui.DonhuyActivity
import com.nguyenvansapplication.app.modules.donthanhcong.ui.DonthanhcongActivity
import com.nguyenvansapplication.app.modules.quanlydonhang.`data`.viewmodel.QuanlydonhangVM
import kotlin.String
import kotlin.Unit

class QuanlydonhangActivity :
    BaseActivity<ActivityQuanlydonhangBinding>(R.layout.activity_quanlydonhang) {
  //private var arguments: Bundle?
  private val viewModel: QuanlydonhangVM by viewModels<QuanlydonhangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.quanlydonhangVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtNthnhcng.setOnClickListener {
      val descIntent=DonthanhcongActivity.getIntent(this,null)
      startActivity(descIntent)
    }
    binding.txtNhy.setOnClickListener {
      val descIntent=DonhuyActivity.getIntent(this,null)
      startActivity(descIntent)
    }
  }

  companion object {
    const val TAG: String = "QUANLYDONHANG_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuanlydonhangActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

  }
}
