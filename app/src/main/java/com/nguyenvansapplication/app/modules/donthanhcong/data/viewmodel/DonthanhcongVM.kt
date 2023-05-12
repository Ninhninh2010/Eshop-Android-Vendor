package com.nguyenvansapplication.app.modules.donthanhcong.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.donthanhcong.`data`.model.DonthanhcongModel
import org.koin.core.KoinComponent

class DonthanhcongVM : ViewModel(), KoinComponent {
  val donthanhcongModel: MutableLiveData<DonthanhcongModel> = MutableLiveData(DonthanhcongModel())

  var navArguments: Bundle? = null
}
