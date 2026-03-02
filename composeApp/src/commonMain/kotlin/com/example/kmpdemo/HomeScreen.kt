package com.example.kmpdemo


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.add_fun_voice_effects_like_robot_echo_or_cartoon
import kmpdemo.composeapp.generated.resources.ai_voice_cloning
import kmpdemo.composeapp.generated.resources.bg_ai_sound_effect
import kmpdemo.composeapp.generated.resources.bg_ai_speech_to_text
import kmpdemo.composeapp.generated.resources.bg_ai_text_to_music
import kmpdemo.composeapp.generated.resources.bg_ai_text_to_voice
import kmpdemo.composeapp.generated.resources.bg_my_history
import kmpdemo.composeapp.generated.resources.bg_voice_cloning
import kmpdemo.composeapp.generated.resources.clone_your_voice_with_ai_for_natural_and_realistic_speech
import kmpdemo.composeapp.generated.resources.compose_multiplatform
import kmpdemo.composeapp.generated.resources.create_music_from_your_words_using_ai_fun_and_fast
import kmpdemo.composeapp.generated.resources.ic_ai_sound_effect
import kmpdemo.composeapp.generated.resources.ic_ai_speech_to_text
import kmpdemo.composeapp.generated.resources.ic_ai_text_to_music
import kmpdemo.composeapp.generated.resources.ic_ai_text_to_voice
import kmpdemo.composeapp.generated.resources.ic_ai_voice_cloning
import kmpdemo.composeapp.generated.resources.ic_history_home
import kmpdemo.composeapp.generated.resources.my_history
import kmpdemo.composeapp.generated.resources.sound_effects
import kmpdemo.composeapp.generated.resources.speak_and_convert_your_voice_into_accurate_text
import kmpdemo.composeapp.generated.resources.speech_to_text
import kmpdemo.composeapp.generated.resources.start_cloning
import kmpdemo.composeapp.generated.resources.turn_any_text_into_lifelike_speech_using_smart_voice_styles
import kmpdemo.composeapp.generated.resources.view_and_manage_your_saved_voice_and_music_files
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun HomeScreen() {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = Color.White,
        topBar = {
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            val gradient = Brush.horizontalGradient(
                colors = listOf(Color(0xFF6A1B9A), Color(0xFF8E24AA))
            )


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    .backgroundImageAndColor(
                        image = painterResource(Res.drawable.bg_voice_cloning),
                        color = Color(0xFF23246C),
                        shape = RoundedCornerShape(12.dp)
                    )
            ) {

                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(Res.drawable.ic_ai_voice_cloning),
                        contentDescription = null,
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(modifier = Modifier.width(26.dp))
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = stringResource(Res.string.ai_voice_cloning),
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = stringResource(Res.string.clone_your_voice_with_ai_for_natural_and_realistic_speech),
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 14.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(16.dp))

                        Button(
                            onClick = {
//                                onItemClick("123")
                            },
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = stringResource(Res.string.start_cloning),
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }

                    }

                }

            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .backgroundImageAndColor(
                            image = painterResource(Res.drawable.bg_ai_text_to_voice),
                            color = Color(0xFF23246C),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.ic_ai_text_to_voice),
                        contentDescription = null,
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(modifier = Modifier.width(26.dp))
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()) {
                        Text(
                            text = "AI Text to Voice",
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = stringResource(Res.string.turn_any_text_into_lifelike_speech_using_smart_voice_styles),
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 14.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = {
//                                navigate.invoke(Screen.Details.route)
                            },
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = "Generate Voice",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)){
                Box(modifier = Modifier.weight(1f)){
                    Column( modifier = Modifier
                        .backgroundImageAndColor(
                            image = painterResource(Res.drawable.bg_ai_sound_effect),
                            color = Color(0xFF23246C),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp)){
                        Image(
                            painter = painterResource(Res.drawable.ic_ai_sound_effect),
                            contentDescription = null,
                            modifier = Modifier.size(36.dp)
                        )
                        Text(
                            text = stringResource(Res.string.sound_effects),
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                       Text(
                           text = stringResource(Res.string.add_fun_voice_effects_like_robot_echo_or_cartoon),
                           fontSize = 14.sp,
                           modifier = Modifier.fillMaxWidth(),
                           maxLines = 3,
                           overflow = TextOverflow.Ellipsis,
                           color = Color.Gray,
                           fontWeight = FontWeight.Medium
                       )

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = "Add Effects",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(modifier = Modifier.weight(1f)){
                    Column( modifier = Modifier
                        .backgroundImageAndColor(
                            image = painterResource(Res.drawable.bg_ai_text_to_music),
                            color = Color(0xFF23246C),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp)){
                        Image(
                            painter = painterResource(Res.drawable.ic_ai_text_to_music),
                            contentDescription = null,
                            modifier = Modifier.size(36.dp)
                        )
                        Text(
                            text = "Text to Music",
                            fontSize = 16.sp,
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = stringResource(Res.string.create_music_from_your_words_using_ai_fun_and_fast),
                            fontSize = 14.sp,
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = "Create Music",
                                color = Color.Black,
                                fontSize = 16.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }
                    }
                }

            }

            Spacer(modifier = Modifier.height(16.dp))

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp)){
                Box(modifier = Modifier.weight(1f)){
                    Column( modifier = Modifier
                        .backgroundImageAndColor(
                            image = painterResource(Res.drawable.bg_ai_speech_to_text),
                            color = Color(0xFF23246C),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp)){
                        Image(
                            painter = painterResource(Res.drawable.ic_ai_speech_to_text),
                            contentDescription = null,
                            modifier = Modifier.size(36.dp)
                        )
                        Text(
                            text = stringResource(Res.string.speech_to_text),
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = stringResource(Res.string.speak_and_convert_your_voice_into_accurate_text),
                            fontSize = 14.sp,
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = "Start Now",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(modifier = Modifier.weight(1f)){
                    Column( modifier = Modifier
                        .backgroundImageAndColor(
                            image = painterResource(Res.drawable.bg_my_history),
                            color = Color(0xFF23246C),
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp)){
                        Image(
                            painter = painterResource(Res.drawable.ic_history_home),
                            contentDescription = null,
                            modifier = Modifier.size(36.dp)
                        )
                        Text(
                            text = stringResource(Res.string.my_history),
                            fontSize = 16.sp,
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = stringResource(Res.string.view_and_manage_your_saved_voice_and_music_files),
                            fontSize = 14.sp,
                            modifier = Modifier.fillMaxWidth(),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            color = Color.Gray,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Transparent
                            ),
                            shape = RoundedCornerShape(24.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(brush = gradient, shape = RoundedCornerShape(24.dp))
                        ) {
                            Text(
                                text = "View Files",
                                color = Color.Black,
                                fontSize = 16.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(12.dp)
                            )
                        }
                    }
                }

            }
        }
    }

//            Text("Home Screen")
//
//            OutlinedTextField(
//                value = text,
//                onValueChange = { newText -> text = newText }
//            )
//
//            Button(onClick = { onItemClick(text) }) {
//                Text("Go to Details")
//            }
//
//            Button(onClick = { navigate(Screen.Details.route) }) {
//                Text("Go with route")
//            }

}

@Preview (showBackground = true)
@Composable
fun HomeScreenPreview() {
        HomeScreen()
}


