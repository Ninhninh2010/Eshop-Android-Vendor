package com.nguyenvansapplication.app.modules.khachhang.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityKhachhangBinding
import com.nguyenvansapplication.app.modules.khachhang.`data`.viewmodel.KhachhangVM
import com.nguyenvansapplication.app.modules.message.ui.MessageActivity
import com.nguyenvansapplication.app.modules.quanlydonhang.ui.QuanlydonhangActivity
import kotlin.String
import kotlin.Unit

class KhachhangActivity() : BaseActivity<ActivityKhachhangBinding>(R.layout.activity_khachhang) {
  private val viewModel: KhachhangVM by viewModels<KhachhangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.khachhangVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearTableRowConta.setOnClickListener {
      val descIntent=MessageActivity.getIntent(this,null)
      startActivity(descIntent)
    }
    binding.linearTableRowChat.setOnClickListener {
      val descIntent=MessageActivity.getIntent(this,null)
      startActivity(descIntent)
    }
  }

  companion object {
    const val TAG: String = "KHACHHANG_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KhachhangActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
