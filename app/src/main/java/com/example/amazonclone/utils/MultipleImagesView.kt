package com.example.amazonclone.utils

import android.content.Context
import android.util.AttributeSet
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MultipleImagesView(context: Context, attributes: AttributeSet) :
    androidx.appcompat.widget.AppCompatImageView(context, attributes) {
    val job = Job()
    val dispatcher = Dispatchers.IO + job

    var imagesUrls: MutableList<String>? = null
    var index = 0

    fun setImageUrls(urls: MutableList<String>) {
        this.imagesUrls = urls
        setup()
    }

    private fun setup() {
        GlobalScope.launch(dispatcher) {
            while (true) {
                GlobalScope.launch(Dispatchers.Main) {
                    imagesUrls?.let {
                        loadImage(it[index])
                    }
                }

                delay(4000)

                if (index < imagesUrls?.lastIndex ?: 0) {
                    ++index
                } else {
                    index = 0
                }
            }
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        job.cancel()
    }
}