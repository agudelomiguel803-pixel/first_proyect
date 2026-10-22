package com.sena.actividad_3.ui.navigation

object HomeRoute {
    val route = "home"
}

object ProductsRoute {
    val route = "products"
}

object ProductDetailRoute {
    val route = "product_detail/{productId}"
    fun createRoute(productId: String): String {
        return "product_detail/$productId"
    }
}

object CartRoute {
    val route = "cart?coupon={coupon}"
    fun createRoute(coupon: String? = null): String {
        return if (coupon != null) "cart?coupon=$coupon" else "cart"
    }
}

object ProfileRoute {
    val route = "profile/{userName}"
    fun createRoute(userName: String): String {
        return "profile/$userName"
    }
}
