package com.nguyenvansapplication.app.modules.message.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MessageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchTwoValue: String? = null
)
