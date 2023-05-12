package com.nguyenvansapplication.app.modules.khachhang.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KhachhangModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_kh_ch_h_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ph_n_h_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetter: String? = MyApp.getInstance().resources.getString(R.string.lbl_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ph_n_h_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecondarytex: String? = MyApp.getInstance().resources.getString(R.string.lbl_thong_tin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ph_n_h_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecondarytexOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_thong_tin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_30_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecondarytexTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_thong_tin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltext: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTableRowDefauValue: String? = null
)
