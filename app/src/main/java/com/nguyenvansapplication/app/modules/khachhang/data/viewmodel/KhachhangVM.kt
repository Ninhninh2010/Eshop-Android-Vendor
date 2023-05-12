package com.nguyenvansapplication.app.modules.khachhang.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.khachhang.`data`.model.KhachhangModel
import org.koin.core.KoinComponent

class KhachhangVM : ViewModel(), KoinComponent {
  val khachhangModel: MutableLiveData<KhachhangModel> = MutableLiveData(KhachhangModel())

  var navArguments: Bundle? = null
}
