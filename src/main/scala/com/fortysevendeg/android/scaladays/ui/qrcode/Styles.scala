/*
 * Copyright (C) 2015 47 Degrees, LLC http://47deg.com hello@47deg.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may
 *  not use this file except in compliance with the License. You may obtain
 *  a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.fortysevendeg.android.scaladays.ui.qrcode

import android.view.Gravity
import android.widget.ImageView.ScaleType
import android.widget.{TextView, ImageView, LinearLayout}
import com.fortysevendeg.android.scaladays.R
import com.fortysevendeg.android.scaladays.ui.commons.ResourceLoader
import com.fortysevendeg.macroid.extras.FrameLayoutTweaks._
import com.fortysevendeg.macroid.extras.ImageViewTweaks._
import com.fortysevendeg.macroid.extras.LinearLayoutTweaks._
import com.fortysevendeg.macroid.extras.RecyclerViewTweaks._
import com.fortysevendeg.macroid.extras.TextTweaks._
import com.fortysevendeg.macroid.extras.ViewTweaks._
import macroid.{Tweak, AppContext}
import macroid.FullDsl._

import scala.language.postfixOps

trait Styles extends ResourceLoader {

  val qrContentStyle: Tweak[LinearLayout] =
    vWrapContent +
      flLayoutGravity(Gravity.CENTER) +
      llGravity(Gravity.CENTER_HORIZONTAL) +
      llVertical

  val qrImageStyle: Tweak[ImageView] =
    vWrapContent +
      ivSrc(R.drawable.placeholder_contact)

  def qrMessageStyle(implicit appContext: AppContext): Tweak[TextView] =
    vWrapContent +
      tvText(R.string.scanMessage) +
      tvGravity(Gravity.CENTER) +
      tvColorResource(R.color.text_error_message) +
      tvSize(getInt(R.integer.text_big)) +
      vPaddings(getDimension(R.dimen.padding_default_big))

  def qrButtonStyle(implicit appContext: AppContext): Tweak[TextView] =
    vWrapContent +
      vMinWidth(getDimension(R.dimen.width_button)) +
      tvText(R.string.scan) +
      tvColorResource(R.color.text_error_button) +
      vBackground(R.drawable.background_error_button) +
      tvAllCaps +
      tvSize(getInt(R.integer.text_big)) +
      tvGravity(Gravity.CENTER)

}

