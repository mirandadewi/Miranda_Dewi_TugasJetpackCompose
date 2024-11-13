package com.example.miranda_dewi_tugasjetpackcompose.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.android.volley.toolbox.ImageRequest
import com.example.miranda_dewi_tugasjetpackcompose.R

import com.example.miranda_dewi_tugasjetpackcompose.data.database
import com.example.miranda_dewi_tugasjetpackcompose.model.ProductItem

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    productId: Int?
) {
    val newProductList = database.Product.filter { productItem ->
        productItem.id == productId
    }

    if (newProductList.isEmpty()) {
        // Handle the case where no product is found (optional)
        Text(text = "Product not found", modifier = Modifier.padding(16.dp))
        return
    }

    // Use fillMaxSize to take up the whole screen and center content
    Box(
        modifier = Modifier.fillMaxSize(), // Make the Box take up the full screen
        contentAlignment = Alignment.Center // Center content within the Box
    ) {
        DetailProductContent(newProductList = newProductList)
    }
}

@Composable
private fun DetailProductContent(
    newProductList: List<ProductItem>,
    modifier: Modifier = Modifier
) {
    val product = newProductList[0] // Assuming only one product is passed

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Image
        Image(
            painter = painterResource(id = product.photo), // Assuming `product.photo` is a valid resource ID
            contentDescription = product.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(300.dp) // Adjust size of the image
                .clip(RoundedCornerShape(16.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Product Name
        Text(
            text = product.name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Product Description (Role)
        Text(
            text = product.description,
            style = MaterialTheme.typography.bodyLarge.copy(
                lineHeight = 24.sp
            ),
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DetailProductContentPreview() {
    // Pass a preview list (for testing) with sample data
    val sampleProductList = listOf(
        ProductItem(id = 1, name = "Sample Cake", description = "Delicious dessert", photo = R.drawable.produk1)
    )
    DetailProductContent(newProductList = sampleProductList)
}


