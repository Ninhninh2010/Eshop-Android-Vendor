package com.nguyenvansapplication.app.modules.quanlydoanhthu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.quanlydoanhthu.`data`.model.QuanlydoanhthuModel
import org.koin.core.KoinComponent

class QuanlydoanhthuVM : ViewModel(), KoinComponent {
  val quanlydoanhthuModel: MutableLiveData<QuanlydoanhthuModel> =
      MutableLiveData(QuanlydoanhthuModel())

  var navArguments: Bundle? = null
}
