package com.example.amazonclone.utils

import android.app.Activity
import android.graphics.Bitmap
import android.os.Build
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop

fun setStatusBarColor(activity: Activity, bgColor: Int, textDark: Boolean = false) {
    activity.window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    activity.window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    activity.window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    activity.window.statusBarColor = ContextCompat.getColor(activity, bgColor)
    activity.window.decorView.systemUiVisibility =
        if (textDark) if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            0
        } else 0
}

fun ImageView.loadCircularImage(url: String) {
    Glide.with(this).load(url)
        .transform(MultiTransformation<Bitmap>(CenterCrop(), CircleCrop()))
        .into(this)
}

fun ImageView.loadImage(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}