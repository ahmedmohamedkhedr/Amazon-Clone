package com.example.amazonclone.utils

import android.content.Context
import android.util.AttributeSet
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.amazonclone.R
import kotlinx.coroutines.*


class MultipleImagesView(context: Context, attributes: AttributeSet) :
    androidx.appcompat.widget.AppCompatImageView(context, attributes),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {

    private var job = Job()

    private var imagesUrls: MutableList<String>? = null
    private var index = 0

    fun setImageUrls(urls: MutableList<String>) {
        this.imagesUrls = urls
        setup()
    }

    private fun setup() {
        launch(Dispatchers.IO + job) {
            while (true) {
                launch(Dispatchers.Main + job) {
                    animateTransition()
                    imagesUrls?.let {
                        loadImage(it[index])
                    }
                }

                delay(5000)

                if (index < imagesUrls?.lastIndex ?: 0) {
                    ++index
                } else {
                    index = 0
                }
            }
        }
    }


    private fun animateTransition() {
        val animFadeOut: Animation = AnimationUtils.loadAnimation(
            context,
            R.anim.fadeout
        )

        val animFadeIn: Animation =
            AnimationUtils.loadAnimation(context, R.anim.fadein)

        animFadeOut.reset()
        clearAnimation()
        startAnimation(animFadeOut)

        animFadeIn.reset()
        clearAnimation()
        startAnimation(animFadeIn)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        job.cancel()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        job = Job()
    }
}