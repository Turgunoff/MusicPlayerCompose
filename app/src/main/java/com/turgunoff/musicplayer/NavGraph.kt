package com.turgunoff.musicplayer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.turgunoff.musicplayer.screens.ArtistsScreen
import com.turgunoff.musicplayer.screens.BrowserScreen
import com.turgunoff.musicplayer.screens.GenresScreen
import com.turgunoff.musicplayer.screens.HomeScreen

/**
 * Created by Eldor Turgunov.
 * Music Player
 * eldorturgunov777@gmail.com
 */
object MainDestinations {

    const val BROWSER_ROOT = "Browser"
    const val ARTISTS_ROOT = "Artists"
    const val HOME_ROOT = "Home"
    const val GENRES_ROOT = "Genres"
    const val MY_MUSIC_ROOT = "MyMusic"
}

@Composable
internal fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController,
        startDestination = BottomNavigationScreens.Browser.route
    ) {
        composable(BottomNavigationScreens.Browser.route) {
            BrowserScreen()
        }
        composable(BottomNavigationScreens.Artists.route) {
            ArtistsScreen()
        }
        composable(BottomNavigationScreens.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationScreens.Genres.route) {
            GenresScreen()
        }
        composable(BottomNavigationScreens.MyMusic.route) {
            MyMusicScreen()
        }
    }
}