package com.nguyenvansapplication.app.modules.spash.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.spash.`data`.model.SpashModel
import org.koin.core.KoinComponent

class SpashVM : ViewModel(), KoinComponent {
  val spashModel: MutableLiveData<SpashModel> = MutableLiveData(SpashModel())

  var navArguments: Bundle? = null
}
