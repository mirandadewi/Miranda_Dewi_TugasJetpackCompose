package com.example.miranda_dewi_tugasjetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miranda_dewi_tugasjetpackcompose.R
import com.example.miranda_dewi_tugasjetpackcompose.data.database
import com.example.miranda_dewi_tugasjetpackcompose.model.GalleryItem

@Composable
fun GalleryScreen(
    modifier: Modifier = Modifier,
    galleries: List<GalleryItem> = database.Gallery
){
        Image(
            painter = painterResource(id = R.drawable.bg_md),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(galleries, key = { it.id }) {
                    Image(
                        painter = painterResource(id = it.photo),
                        contentDescription = it.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    )
                }
            }
        }
    }

@Preview(showSystemUi = true)
@Composable
private fun GalleryScreenPreview() {
    GalleryScreen(galleries = database.Gallery)
}
