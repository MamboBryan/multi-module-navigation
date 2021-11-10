package com.play.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.play.signin.R
import com.play.signin.databinding.FragmentSignInBinding

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private val binding by viewBinding(FragmentSignInBinding::bind)
    private val viewModel by viewModels<SignInViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            edtName.setText(viewModel.name)

            btnSignIn.setOnClickListener { navigateToDashboard() }
            btnSignUp.setOnClickListener { navigateToSignUp() }

        }
    }

    private fun navigateToDashboard() {

    }

    /**
     * TODO navigate to SignUpFragment in signup:module
     */
    private fun navigateToSignUp() {}

}