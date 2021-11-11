package com.play.navigation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.play.core.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    state: SavedStateHandle
) : ViewModel() {

    //TODO get the User class passed from SplashViewModel
    val user = state.get<User>("user")

    val name = user?.name ?: ""

}