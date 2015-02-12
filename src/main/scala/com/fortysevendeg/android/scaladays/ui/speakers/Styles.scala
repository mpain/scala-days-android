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

package com.fortysevendeg.android.scaladays.ui.speakers

import android.view.Gravity
import android.widget.ImageView.ScaleType
import android.widget.LinearLayout
import com.fortysevendeg.android.scaladays.R
import com.fortysevendeg.macroid.extras.FrameLayoutTweaks._
import com.fortysevendeg.macroid.extras.ImageViewTweaks._
import com.fortysevendeg.macroid.extras.LinearLayoutTweaks._
import com.fortysevendeg.macroid.extras.RecyclerViewTweaks._
import com.fortysevendeg.macroid.extras.TextTweaks._
import com.fortysevendeg.macroid.extras.ViewTweaks._
import macroid.AppContext
import macroid.FullDsl._

import scala.language.postfixOps

trait FragmentStyles {

  val rootStyle = vMatchParent

  val recyclerViewStyle = vMatchParent +
      rvNoFixedSize

  val progressBarStyle = vWrapContent +
      flLayoutGravity(Gravity.CENTER)

}

trait AdapterStyles {

  def itemContentStyle(implicit appContext: AppContext) = vMatchParent +
      llHorizontal +
      vPaddings(16 dp) +
      vBackground(R.drawable.background_list_default)

  def avatarStyle(implicit appContext: AppContext) = lp[LinearLayout](40 dp, 40 dp) +
      ivScaleType(ScaleType.CENTER_CROP)

  def itemNoAvatarContentStyle(implicit appContext: AppContext) = vMatchWidth +
      llVertical +
      vPadding(16 dp, 0, 0, 0)

  def nameItemStyle(implicit appContext: AppContext) = vWrapContent +
      tvSize(16) +
      tvColorResource(R.color.text_title_default)

  def twitterItemStyle(implicit appContext: AppContext) = vWrapContent +
      tvSize(12) +
      tvColorResource(R.color.text_twitter_default)

  def bioItemStyle(implicit appContext: AppContext) = vWrapContent +
      tvSize(14) +
      tvColorResource(R.color.text_title_default) +
      vPadding(0, 4 dp, 0, 0)

}
