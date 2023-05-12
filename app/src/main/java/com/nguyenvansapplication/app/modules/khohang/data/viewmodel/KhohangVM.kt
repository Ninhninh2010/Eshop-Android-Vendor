package com.nguyenvansapplication.app.modules.khohang.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.khohang.`data`.model.KhohangModel
import org.koin.core.KoinComponent

class KhohangVM : ViewModel(), KoinComponent {
  val khohangModel: MutableLiveData<KhohangModel> = MutableLiveData(KhohangModel())

  var navArguments: Bundle? = null
}
