package com.nguyenvansapplication.app.modules.itemmenumainshop.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenumainshopModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMdAshadullaH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_md_ashadulla_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_last_login_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_last_transectio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_n_ph_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kh_ch_h_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentySeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qu_n_l_doanh_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentySix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qu_n_l_n_h_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHthngcah: String? = MyApp.getInstance().resources.getString(R.string.msg_h_th_ng_c_a_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_c_i_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_others)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_admin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyValue: String? = null
)
