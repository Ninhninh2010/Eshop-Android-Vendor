package com.nguyenvansapplication.app.modules.donhuy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.donhuy.`data`.model.DonhuyModel
import org.koin.core.KoinComponent

class DonhuyVM : ViewModel(), KoinComponent {
  val donhuyModel: MutableLiveData<DonhuyModel> = MutableLiveData(DonhuyModel())

  var navArguments: Bundle? = null
}
