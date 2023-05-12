package com.nguyenvansapplication.app.modules.khohang.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KhohangModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGS: String? = MyApp.getInstance().resources.getString(R.string.lbl_ms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_41_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhohng: String? = MyApp.getInstance().resources.getString(R.string.lbl_kho_h_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDparagonbukit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_d_paragon_bukit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt49980: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9_980)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_giamgia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndexProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_indexproduct)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMota: String? = MyApp.getInstance().resources.getString(R.string.lbl_mota)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)

)
