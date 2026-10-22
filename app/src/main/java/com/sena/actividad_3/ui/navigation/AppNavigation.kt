package com.sena.actividad_3.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute.route,
        modifier = modifier
    ) {
        // 1. Pantalla de Inicio (sin parámetros)
        composable(HomeRoute.route) {
            com.sena.actividad_3.ui.screen.HomeScreen(
                onNavigateToProducts = { navController.navigate(ProductsRoute.route) },
                onNavigateToProductDetail = { id -> navController.navigate(ProductDetailRoute.createRoute(id)) },
                onNavigateToCart = { coupon -> navController.navigate(CartRoute.createRoute(coupon)) },
                onNavigateToProfile = { user -> navController.navigate(ProfileRoute.createRoute(user)) }
            )
        }

        // 2. Pantalla de Productos (sin parámetros)
        composable(ProductsRoute.route) {
            com.sena.actividad_3.ui.screen.ProductsScreen(
                onNavigateToDetail = { id -> navController.navigate(ProductDetailRoute.createRoute(id)) },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        // 3. Detalle de Producto (con parámetro obligatorio)
        composable(
            route = ProductDetailRoute.route,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            com.sena.actividad_3.ui.screen.ProductDetailScreen(
                productId = productId,
                onNavigateToCartWithCoupon = { coupon -> navController.navigate(CartRoute.createRoute(coupon)) },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        // 4. Carrito (con parámetro opcional)
        composable(
            route = CartRoute.route,
            arguments = listOf(
                navArgument("coupon") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = null
                }
            )
        ) { backStackEntry ->
            val coupon = backStackEntry.arguments?.getString("coupon")
            com.sena.actividad_3.ui.screen.CartScreen(
                coupon = coupon,
                onNavigateToProfile = { user -> navController.navigate(ProfileRoute.createRoute(user)) },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        // 5. Perfil (con parámetro obligatorio)
        composable(
            route = ProfileRoute.route,
            arguments = listOf(navArgument("userName") { type = NavType.StringType })
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName") ?: ""
            com.sena.actividad_3.ui.screen.ProfileScreen(
                userName = userName,
                onNavigateToHome = {
                    navController.navigate(HomeRoute.route) {
                        popUpTo(HomeRoute.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
