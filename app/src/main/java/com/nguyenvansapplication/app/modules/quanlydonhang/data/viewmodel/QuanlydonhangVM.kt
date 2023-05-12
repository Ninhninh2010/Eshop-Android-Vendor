package com.nguyenvansapplication.app.modules.quanlydonhang.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.quanlydonhang.`data`.model.QuanlydonhangModel
import org.koin.core.KoinComponent

class QuanlydonhangVM : ViewModel(), KoinComponent {
  val quanlydonhangModel: MutableLiveData<QuanlydonhangModel> =
      MutableLiveData(QuanlydonhangModel())

  var navArguments: Bundle? = null
}
