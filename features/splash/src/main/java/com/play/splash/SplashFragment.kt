package com.play.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.play.core.User
import com.play.splash.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private val binding by viewBinding(FragmentSplashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignIn.setOnClickListener { navigateToSignIn() }
            btnSignUp.setOnClickListener { navigateToSignUp() }
        }

    }

    /**
     * TODO navigate to SignInFragment in signin:module with user data
     */
    private fun navigateToSignIn() {

        val user = User(name = "Harun")

    }

    /**
     * TODO navigate to SignUpFragment in signup:module
     */
    private fun navigateToSignUp() {}

}