package com.example.miranda_dewi_tugasjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.miranda_dewi_tugasjetpackcompose.screens.*
import com.example.miranda_dewi_tugasjetpackcompose.ui.theme.Miranda_Dewi_TugasJetpackComposeTheme
import com.example.miranda_dewi_tugasjetpackcompose.model.AboutViewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    private val aboutViewModel: AboutViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Miranda_Dewi_TugasJetpackComposeTheme {
                MainScreen(aboutViewModel)
            }
        }
    }
}

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Filled.Home)
    object Gallery : Screen("gallery", "Gallery", Icons.Filled.Menu)
    object About : Screen("about", "About", Icons.Filled.Info)
    object Detail : Screen("detail/{productId}", "Product Detail", Icons.Filled.Info)
    object Diskon : Screen("discount/{discountId}", "Discount Detail", Icons.Filled.Info)
}


@Composable
fun MainScreen(aboutViewModel: AboutViewModel) {
    val navController = rememberNavController()

    Scaffold(
        topBar = { TopAppBar(navController = navController) },
        bottomBar = { BottomNavigationBar(navController) },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFE3F2FD))
                    .padding(innerPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bg_md),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                )
                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.route
                ) {
                    composable(Screen.Home.route) {
                        HomeScreen(navController = navController)
                    }
                    composable(Screen.Gallery.route) { GalleryScreen() }
                    composable(Screen.About.route) { AboutScreen(viewModel = aboutViewModel) }

                    composable("discount/{discountId}") { backStackEntry ->
                        val discountId =
                            backStackEntry.arguments?.getString("discountId")?.toIntOrNull()
                        Log.d(
                            "DetailScreen",
                            "Navigated to DetailScreen with discountId: $discountId"
                        )
                        DetailDiskonScreen(navController = navController, diskonId = discountId)
                    }
                    composable("detail/{productId}") { backStackEntry ->
                        val productId =
                            backStackEntry.arguments?.getString("productId")?.toIntOrNull()
                        Log.d(
                            "DetailScreen",
                            "Navigated to DetailScreen with productId: $productId"
                        )
                        DetailScreen(navController = navController, productId = productId)
                    }
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(navController: NavHostController, modifier: Modifier = Modifier) {
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    TopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = when (currentRoute) {
                    Screen.Home.route -> Screen.Home.title
                    Screen.Gallery.route -> Screen.Gallery.title
                    Screen.About.route -> Screen.About.title
                    Screen.Detail.route -> "Product Detail"
                    Screen.Diskon.route -> "Discount Detail"
                    else -> "MD Bakery"
                }
            )
        },
        navigationIcon = {
            if (currentRoute != Screen.Home.route) {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}



@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        Screen.Home,
        Screen.Gallery,
        Screen.About
    )
    NavigationBar {
        val currentRoute = navController.currentBackStackEntry?.destination?.route

        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = screen.title) },
                label = { Text(screen.title) },
                selected = currentRoute == screen.route,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}
