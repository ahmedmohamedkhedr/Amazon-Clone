package com.example.amazonclone.ui.product

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.GONE
import androidx.appcompat.app.AppCompatActivity
import com.example.amazonclone.R
import com.example.amazonclone.databinding.ActivityProductDetailsBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.ProductModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProductDetailsActivity : AppCompatActivity() {
    private lateinit var ui: ActivityProductDetailsBinding
    private lateinit var id: String
    private val viewModel by viewModel<ProductDetailsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityProductDetailsBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        getArgs()
        viewModel.getProductById(id)
        viewModel._productLiveData.observe(this) {
            bindView(it)
        }
    }

    private fun getArgs() {
        intent?.apply {
            getStringExtra(ARG_ID)?.let { id = it }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun bindView(productModel: ProductModel) {
        with(ui.productDetails) {
            thumbnail.loadImage(productModel.thumbnail)
            title.text = productModel.title
        }

        with(ui.productPaymentDetails) {
            price.text = "${getString(R.string.sell_price)} ${productModel.price} ${getString(R.string.egp)}"
            if (productModel.salePrice != null) salePrice.text =
                "${productModel.salePrice} ${getString(R.string.egp)}" else salePrice.visibility =
                GONE

        }
    }

    companion object {
        private const val ARG_ID = "ARG_ID"
        fun start(context: Context, productId: String) {
            context.startActivity(Intent(context, ProductDetailsActivity::class.java).also {
                it.putExtra(
                    ARG_ID, productId
                )
            })
        }
    }
}