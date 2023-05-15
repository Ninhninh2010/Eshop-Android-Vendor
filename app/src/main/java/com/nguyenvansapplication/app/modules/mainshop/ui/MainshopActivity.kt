package com.nguyenvansapplication.app.modules.mainshop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainshopBinding
import com.nguyenvansapplication.app.modules.khachhang.ui.KhachhangActivity
import com.nguyenvansapplication.app.modules.khohang.ui.KhohangActivity
import com.nguyenvansapplication.app.modules.mainshop.data.viewmodel.MainshopVM
import com.nguyenvansapplication.app.modules.quanlydoanhthu.ui.QuanlydoanhthuActivity
import com.nguyenvansapplication.app.modules.quanlydonhang.ui.QuanlydonhangActivity


class MainshopActivity() : BaseActivity<ActivityMainshopBinding>(R.layout.activity_mainshop) {
  private val viewModel: MainshopVM by viewModels<MainshopVM>()


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainshopVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener{

      val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
      val popupView: View = inflater.inflate(R.layout.drawer_item_menumainshop, null)
      val width = LinearLayout.LayoutParams.WRAP_CONTENT
      val height = LinearLayout.LayoutParams.WRAP_CONTENT
      val focusable = true
      val popupWindow = PopupWindow(popupView, width, height, focusable)
      popupWindow.showAtLocation(it, Gravity.LEFT, 0, 0)
     popupView.findViewById<View>(R.id.txtGroupTwentyNine).setOnClickListener{
         startActivity(Intent(this, KhohangActivity::class.java))
     }
      popupView.findViewById<View>(R.id.txtGroupTwentyEight).setOnClickListener{
        startActivity(Intent(this, KhachhangActivity::class.java))
      }
      popupView.findViewById<View>(R.id.txtGroupTwentySeven).setOnClickListener{
        startActivity(Intent(this, QuanlydoanhthuActivity::class.java))
      }
      popupView.findViewById<View>(R.id.txtGroupTwentySix).setOnClickListener{
        startActivity(Intent(this, QuanlydonhangActivity::class.java))
      }
      popupView.findViewById<View>(R.id.txtGroupTwentyOne).setOnClickListener{

      }
        popupView.findViewById<View>(R.id.linearColumnhthngcah).setOnClickListener{
            startActivity(Intent(this, KhohangActivity::class.java))
        }
      popupView.setOnTouchListener { v, event ->
        popupWindow.dismiss()
        true

      }


    }
    binding.imageCalendar.setOnClickListener{
      startActivity(Intent(this, QuanlydoanhthuActivity::class.java))
    }
    binding.imageCalendar.setOnClickListener{
      startActivity(Intent(this, QuanlydoanhthuActivity::class.java))
    }
    binding.imageGlobe.setOnClickListener{
      startActivity(Intent(this, KhohangActivity::class.java))
    }



    /*binding.ima.setOnClickListener{
      startActivity(Intent(requireContext(), ::class.java))
    }*/
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
