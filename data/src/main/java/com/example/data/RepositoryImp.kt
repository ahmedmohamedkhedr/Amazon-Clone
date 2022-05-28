package com.example.data

import com.example.domain.data_interfaces.Repository
import com.example.domain.enums.EntityType
import com.example.domain.models.*
import com.example.domain.models.base.BaseEntity
import kotlin.random.Random

class RepositoryImp : Repository {

    private fun getCategories(): MutableList<CategoryModel> {
        return mutableListOf(
            CategoryModel(
                thumbnail = "https://5.imimg.com/data5/RC/FX/MY-4573598/customized-personal-care-products-500x500.jpg",
                title = "عروض اليوم"
            ),
            CategoryModel(
                thumbnail = "https://www.adderah.com/image/cache/catalog/blog/copuons/discount-copuon-350x350.png",
                title = "كوبونات خصم"
            ),
            CategoryModel(
                thumbnail = "https://m.media-amazon.com/images/I/31YNfi8EsAL._AC_SY780_.jpg",
                title = "المطبخ"
            ),
            CategoryModel(
                thumbnail = "https://mobileegy.com/wp-content/uploads/2021/12/%D8%A7%D8%B3%D8%B9%D8%A7%D8%B1-%D9%85%D9%88%D8%A8%D8%A7%D9%8A%D9%84%D8%A7%D8%AA-%D9%81%D9%8A%D9%81%D9%88-2022-1024x868.jpg",
                title = "الموبايلات"
            ),
            CategoryModel(
                thumbnail = "https://cdn.shopify.com/s/files/1/0214/2080/2112/products/jromy-shambo-lnmo-alshaar-watermans-grow-me-shampoo-378775.jpg?v=1643547399",
                title = "الجمال"
            ),
            CategoryModel(
                thumbnail = "https://www.n-3rab.com/wp-content/uploads/2018/09/%D8%A7%D9%84%D9%83%D9%85%D8%A8%D9%8A%D9%88%D8%AA%D8%B1.jpg",
                title = "الكمبيوتر"
            ),
            CategoryModel(
                thumbnail = "https://small-projects.org/wp-content/uploads/2016/02/%D9%85%D8%B4%D8%B1%D9%88%D8%B9-%D8%A8%D9%82%D8%A7%D9%84%D8%A9-%D9%85%D8%B1%D8%A8%D8%AD.jpg",
                title = "السوبر ماركت"
            ), CategoryModel(
                thumbnail = "https://5.imimg.com/data5/RC/FX/MY-4573598/customized-personal-care-products-500x500.jpg",
                title = "عروض اليوم"
            ),
            CategoryModel(
                thumbnail = "https://www.adderah.com/image/cache/catalog/blog/copuons/discount-copuon-350x350.png",
                title = "كوبونات خصم"
            ),
            CategoryModel(
                thumbnail = "https://m.media-amazon.com/images/I/31YNfi8EsAL._AC_SY780_.jpg",
                title = "المطبخ"
            ),
            CategoryModel(
                thumbnail = "https://mobileegy.com/wp-content/uploads/2021/12/%D8%A7%D8%B3%D8%B9%D8%A7%D8%B1-%D9%85%D9%88%D8%A8%D8%A7%D9%8A%D9%84%D8%A7%D8%AA-%D9%81%D9%8A%D9%81%D9%88-2022-1024x868.jpg",
                title = "الموبايلات"
            ),
            CategoryModel(
                thumbnail = "https://cdn.shopify.com/s/files/1/0214/2080/2112/products/jromy-shambo-lnmo-alshaar-watermans-grow-me-shampoo-378775.jpg?v=1643547399",
                title = "الجمال"
            ),
            CategoryModel(
                thumbnail = "https://www.n-3rab.com/wp-content/uploads/2018/09/%D8%A7%D9%84%D9%83%D9%85%D8%A8%D9%8A%D9%88%D8%AA%D8%B1.jpg",
                title = "الكمبيوتر"
            ),
            CategoryModel(
                thumbnail = "https://small-projects.org/wp-content/uploads/2016/02/%D9%85%D8%B4%D8%B1%D9%88%D8%B9-%D8%A8%D9%82%D8%A7%D9%84%D8%A9-%D9%85%D8%B1%D8%A8%D8%AD.jpg",
                title = "السوبر ماركت"
            ), CategoryModel(
                thumbnail = "https://5.imimg.com/data5/RC/FX/MY-4573598/customized-personal-care-products-500x500.jpg",
                title = "عروض اليوم"
            ),
            CategoryModel(
                thumbnail = "https://www.adderah.com/image/cache/catalog/blog/copuons/discount-copuon-350x350.png",
                title = "كوبونات خصم"
            ),
            CategoryModel(
                thumbnail = "https://m.media-amazon.com/images/I/31YNfi8EsAL._AC_SY780_.jpg",
                title = "المطبخ"
            ),
            CategoryModel(
                thumbnail = "https://mobileegy.com/wp-content/uploads/2021/12/%D8%A7%D8%B3%D8%B9%D8%A7%D8%B1-%D9%85%D9%88%D8%A8%D8%A7%D9%8A%D9%84%D8%A7%D8%AA-%D9%81%D9%8A%D9%81%D9%88-2022-1024x868.jpg",
                title = "الموبايلات"
            ),
            CategoryModel(
                thumbnail = "https://cdn.shopify.com/s/files/1/0214/2080/2112/products/jromy-shambo-lnmo-alshaar-watermans-grow-me-shampoo-378775.jpg?v=1643547399",
                title = "الجمال"
            ),
            CategoryModel(
                thumbnail = "https://www.n-3rab.com/wp-content/uploads/2018/09/%D8%A7%D9%84%D9%83%D9%85%D8%A8%D9%8A%D9%88%D8%AA%D8%B1.jpg",
                title = "الكمبيوتر"
            ),
            CategoryModel(
                thumbnail = "https://small-projects.org/wp-content/uploads/2016/02/%D9%85%D8%B4%D8%B1%D9%88%D8%B9-%D8%A8%D9%82%D8%A7%D9%84%D8%A9-%D9%85%D8%B1%D8%A8%D8%AD.jpg",
                title = "السوبر ماركت"
            )
        )
    }


    val thumbnails =
        mutableListOf(
            "https://www.bbl-tech.com/wp-content/uploads/2022/02/Outside-Banner.jpg",
            "https://www.instantpromotion.co.uk/media/catalog/product/i/p/ip_pvc.jpg",
            "https://designoffice.co.uk/wp-content/uploads/2019/06/outdoor.jpg",
            "https://print4london.com/sites/default/files/uploaded/PVC%20banner%201st.jpg",
            "https://print.allinglobaltrade.com/wp-content/uploads/2021/07/Free-Billboard-Banner-Mockup-02-removebg-preview.png",
        )


    private fun getBestOfferModels(): MutableList<BestOfferModel> {
        return mutableListOf(
            BestOfferModel(
                banner = "https://d1csarkz8obe9u.cloudfront.net/themedlandingpages/tlp_hero_banners-4ee457a41ec5c9a3ff7d870ac465b9bf-1591658664.jpg",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            ),
            BestOfferModel(
                banner = "https://1757140519.rsc.cdn77.org/blog/wp-content/uploads/2020/04/banner-example-2.jpg",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            ),
            BestOfferModel(
                banner = "https://1757140519.rsc.cdn77.org/blog/wp-content/uploads/2020/04/banner-example-1.png",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            ),
            BestOfferModel(
                banner = "https://i.graphicmama.com/blog/wp-content/uploads/2019/12/09171927/banner-design-ideas.png",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            ),
            BestOfferModel(
                banner = "https://d1csarkz8obe9u.cloudfront.net/themedlandingpages/tlp_hero_banners-4ee457a41ec5c9a3ff7d870ac465b9bf-1591658664.jpg",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            ),
            BestOfferModel(
                banner = "https://www.azbanners.com/wp-content/uploads/2017/11/banner-design-ideas.jpg",
                thumbnail = "https://offautan-uc1.azureedge.net/-/media/images/off/ph/products-en/products-landing/landing/off_overtime_product_collections_large_2x.jpg?la=en-ph",
                title = "خصم حتي 70%"
            )
        )
    }

    private fun getTodayOfferModels(): MutableList<TodayOfferModel> {
        return mutableListOf(
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/images/_graphics/QuickShipBox.png?size=thumb_retina",
                title = "وفر علي امازون والمزيد",
                price = 1600.0,
                sale = 10,
                salePrice = 1440.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/images/_home/Background_promos-m1.png",
                title = "وفر علي امازون والمزيد",
                price = 1000.0,
                sale = 10,
                salePrice = 900.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/custom-bags/cinch-up-back-pack-hq.jpg",
                title = "وفر علي امازون والمزيد",
                price = 800.0,
                sale = 10,
                salePrice = 700.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.sony.com/en/SonyInfo/products/img/productsInfo_sp.jpg",
                title = "وفر علي امازون والمزيد",
                price = 1600.0,
                sale = 10,
                salePrice = 1440.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/images/_graphics/QuickShipBox.png?size=thumb_retina",
                title = "وفر علي امازون والمزيد",
                price = 1600.0,
                sale = 10,
                salePrice = 1440.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/images/_graphics/QuickShipBox.png?size=thumb_retina",
                title = "وفر علي امازون والمزيد",
                price = 1600.0,
                sale = 10,
                salePrice = 1440.0
            ),
            TodayOfferModel(
                thumbnail = "https://www.qualitylogoproducts.com/images/_graphics/QuickShipBox.png?size=thumb_retina",
                title = "وفر علي امازون والمزيد",
                price = 1600.0,
                sale = 10,
                salePrice = 1440.0
            )
        )
    }

    private fun getSavesCornerModels(): MutableList<SavesCornerModel> {
        return mutableListOf(
            SavesCornerModel(
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN0xFOgLfvTWfejmGwE3pJHzHj6Kx8gEKdXw&usqp=CAU",
                title = "عروض اليوم"
            ),
            SavesCornerModel(
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN0xFOgLfvTWfejmGwE3pJHzHj6Kx8gEKdXw&usqp=CAU",
                title = "كوبونات خصم"
            ),
            SavesCornerModel(
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN0xFOgLfvTWfejmGwE3pJHzHj6Kx8gEKdXw&usqp=CAU",
                title = "المطبخ"
            ),
            SavesCornerModel(
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN0xFOgLfvTWfejmGwE3pJHzHj6Kx8gEKdXw&usqp=CAU",
                title = "الموبايلات"
            ),
            SavesCornerModel(
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN0xFOgLfvTWfejmGwE3pJHzHj6Kx8gEKdXw&usqp=CAU",
                title = "الجمال"
            )
        )
    }

    private fun getItems(): MutableList<BaseEntity> {
        return mutableListOf(
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            BannerModel(thumbnail = thumbnails[Random.nextInt(0, 4)]),
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            BannerModel(thumbnail = thumbnails[Random.nextInt(0, 4)]),
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            ItemModel(
                thumbnail = "https://images.fastcompany.net/image/upload/w_1280,f_auto,q_auto,fl_lossy/wp-cms/uploads/2022/03/p-1-most-innovative-products-2022-90731853.jpg",
                title = "خصم اضافي 30% علي براندات مختاره"
            ),
            BannerModel(thumbnail = thumbnails[Random.nextInt(0, 4)]),
        )
    }

    private fun getExploreMoreModels(): ExploreMoreModel {
        return ExploreMoreModel(
            title = "جاهز للتصوير",
            productsThumbnail = mutableListOf(
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
                "https://www.juzaphoto.com/shared_files/recensioni/canon_eos_r5_1200px.jpg",
            )
        )
    }

    private fun getBuyMoreModels(): BuyMoreModel {

        return BuyMoreModel(
            title = "جهز مكتبك المنزلي",
            products = mutableListOf(
                BuyMoreModel.Product(
                    name = "مكتب منزلي",
                    thumbnail = "https://m.media-amazon.com/images/I/41Yu-QbGZqL._AC_SY780_.jpg"
                ),
                BuyMoreModel.Product(
                    name = "مكتب كبير",
                    thumbnail = "https://m.media-amazon.com/images/I/41Yu-QbGZqL._AC_SY780_.jpg"
                ),
                BuyMoreModel.Product(
                    name = "مكتب صغير",
                    thumbnail = "https://m.media-amazon.com/images/I/41Yu-QbGZqL._AC_SY780_.jpg"
                ),
                BuyMoreModel.Product(
                    name = "مكتب منزلي",
                    thumbnail = "https://m.media-amazon.com/images/I/41Yu-QbGZqL._AC_SY780_.jpg"
                )
            )
        )
    }

    override suspend fun getEntities(entityType: EntityType): MutableList<BaseEntity> {
        return when (entityType) {
            EntityType.CATEGORIES -> getCategories() as MutableList<BaseEntity>
            EntityType.BUY_MORE -> mutableListOf(getBuyMoreModels()) as MutableList<BaseEntity>
            EntityType.EXPLORE_MORE -> mutableListOf(getExploreMoreModels()) as MutableList<BaseEntity>
            EntityType.SAVES_CORNER -> getSavesCornerModels() as MutableList<BaseEntity>
            EntityType.BEST_OFFERS -> getBestOfferModels() as MutableList<BaseEntity>
            EntityType.TODAY_OFFER -> getTodayOfferModels() as MutableList<BaseEntity>
            else -> getItems()
        }
    }

    override suspend fun getProduct(id: String): ProductModel {
        return ProductModel(
            id = id,
            1400.0,
            10,
            1300.0,
            "لاب ديل 16 GB RAM كور i5 500 GB هارد يعمل بكفاءه عاليه",
            "https://m.media-amazon.com/images/I/41Yu-QbGZqL._AC_SY780_.jpg"
        )
    }

}