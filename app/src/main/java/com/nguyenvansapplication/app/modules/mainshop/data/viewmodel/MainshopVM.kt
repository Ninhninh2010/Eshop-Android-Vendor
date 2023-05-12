package com.nguyenvansapplication.app.modules.mainshop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mainshop.`data`.model.MainshopModel
import org.koin.core.KoinComponent

class MainshopVM : ViewModel(), KoinComponent {
  val mainshopModel: MutableLiveData<MainshopModel> = MutableLiveData(MainshopModel())

  var navArguments: Bundle? = null
}
