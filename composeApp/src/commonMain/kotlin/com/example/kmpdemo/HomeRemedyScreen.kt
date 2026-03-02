package com.example.kmpdemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.constipation
import kmpdemo.composeapp.generated.resources.ic_arrow_back
import kmpdemo.composeapp.generated.resources.ic_search
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeRemedyScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home Remedy") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back press */ }) {
                        Image(painter = painterResource(Res.drawable.ic_arrow_back), contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFE0F7FA)
                )
            )
        },
        containerColor = Color(0xFFE0F7FA)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            SearchBar()
            Spacer(modifier = Modifier.height(16.dp))
            AlphabetFilter()
            Spacer(modifier = Modifier.height(16.dp))

            RemedyGrid(
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.height(16.dp))
            AdBanner()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text("Search here...") },
        modifier = Modifier
            .fillMaxWidth().focusable(),
        shape = RoundedCornerShape(12.dp),
        trailingIcon = {
            Icon(painter = painterResource(Res.drawable.ic_search), contentDescription = "Search")
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlphabetFilter() {
    val alphabet = ('A'..'Z').toList() + ('Y' downTo 'A').toList()
    var selectedLetter by remember { mutableStateOf('A') }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()), // ✅ REQUIRED
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        alphabet.forEach { letter ->
            Card(
                onClick = { selectedLetter = letter },
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor =
                        if (letter == selectedLetter)
                            Color(0xFF00796B)
                        else Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = letter.toString(),
                        color = if (letter == selectedLetter)
                            Color.White
                        else Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

data class Remedy(val name: String, val icon: DrawableResource)

@Composable
fun RemedyGrid(modifier: Modifier = Modifier) {
    val remedies = listOf(
        Remedy("Constipation", Res.drawable.constipation),
        Remedy("Stomach Ache", Res.drawable.constipation),
        Remedy("Dizzy", Res.drawable.constipation),
        Remedy("Swine Flu", Res.drawable.constipation),
        Remedy("Placeholder", Res.drawable.constipation),
        Remedy("Placeholder", Res.drawable.constipation),
        Remedy("Swine Flu", Res.drawable.constipation),
        Remedy("Placeholder", Res.drawable.constipation),
    )

    LazyVerticalGrid(
        modifier = modifier, // ✅ IMPORTANT
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(remedies) { remedy ->
            RemedyCard(remedy)
        }
    }
}

@Composable
fun RemedyCard(remedy: Remedy) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.height(150.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.5f)
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFD0EFFF)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource( remedy.icon),
                    contentDescription = remedy.name,
                    modifier = Modifier.size(60.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = remedy.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun AdBanner() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        color = Color.LightGray
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Text(text = "ADS HERE", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeRemedyScreen()
}
