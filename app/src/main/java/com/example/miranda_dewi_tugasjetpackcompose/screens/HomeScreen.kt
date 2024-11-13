package com.example.miranda_dewi_tugasjetpackcompose.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.miranda_dewi_tugasjetpackcompose.R
import com.example.miranda_dewi_tugasjetpackcompose.model.DiscountItem
import com.example.miranda_dewi_tugasjetpackcompose.data.database
import com.example.miranda_dewi_tugasjetpackcompose.model.ProductItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    discounts: List<DiscountItem> = database.Discount,
    products: List<ProductItem> = database.Product,
    navController: NavController
) {
    var searchQuery by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_md),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            Text(
                text = "Discount Item",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            LazyRow(
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                items(discounts, key = { it.id }) { discountItem ->
                    Image(
                        painter = painterResource(id = discountItem.photo),
                        contentDescription = discountItem.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .padding(end = 8.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .clickable {
                                // Log the discount ID when clicked
                                Log.d("HomeScreen", "Discount clicked: ${discountItem.id}")
                                navController.navigate("discount/${discountItem.id}")
                            }
                    )
                }
            }

            Text(
                text = "Products",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            val filteredProducts = if (searchQuery.isEmpty()) {
                products
            } else {
                products.filter { it.name.contains(searchQuery, ignoreCase = true) }
            }

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(filteredProducts.chunked(2)) { rowItems ->
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        rowItems.forEach { productItem ->
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(Color(0xFFFFC0CB))
                                    .padding(8.dp)
                                    .clickable {
                                        // Log the product ID when clicked
                                        Log.d("HomeScreen", "Product clicked: ${productItem.id}")
                                        navController.navigate("detail/${productItem.id}")
                                    }
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Image(
                                        painter = painterResource(id = productItem.photo),
                                        contentDescription = productItem.name,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(150.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = productItem.name,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Medium,
                                        modifier = Modifier.align(Alignment.CenterHorizontally)
                                    )
                                }
                            }
                        }
                        if (rowItems.size < 2) {
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }
}

