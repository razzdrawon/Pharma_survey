package com.razzdrawon.pharma_survey;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.razzdrawon.pharma_survey.databinding.ActivityLoginBinding;
import com.razzdrawon.pharma_survey.model.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel loginViewModel = new LoginViewModel("", "");
        binding.setLoginViewModel(loginViewModel);
        binding.setHandler(loginViewModel);
    }
}
