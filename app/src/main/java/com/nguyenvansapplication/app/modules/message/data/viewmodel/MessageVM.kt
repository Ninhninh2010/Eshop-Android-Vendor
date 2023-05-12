package com.nguyenvansapplication.app.modules.message.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.message.`data`.model.MessageModel
import org.koin.core.KoinComponent

class MessageVM : ViewModel(), KoinComponent {
  val messageModel: MutableLiveData<MessageModel> = MutableLiveData(MessageModel())

  var navArguments: Bundle? = null
}
