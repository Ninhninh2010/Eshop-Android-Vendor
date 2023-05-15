package com.nguyenvansapplication.app.modules.message.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.nguyenvansapplication.app.databinding.ActivityMessageBinding
import com.nguyenvansapplication.app.modules.message.`data`.viewmodel.MessageVM
import kotlin.String
import kotlin.Unit

class MessageActivity : BaseActivity<ActivityMessageBinding>(R.layout.activity_message) {
  private val viewModel: MessageVM by viewModels<MessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.messageVM = viewModel
  }

  override fun setUpClicks(): Unit {
   /* binding.linearTableRowConta.setOnClickListener {
      val descIntent=MessageActivity.getIntent(this,null)
      startActivity(descIntent)
    }*/


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "MESSAGE_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MessageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
