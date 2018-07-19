package com.razzdrawon.pharma_survey.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.razzdrawon.pharma_survey.R;

import com.razzdrawon.pharma_survey.databinding.ActivityFinalizationBinding;
import com.razzdrawon.pharma_survey.viewmodel.FinalizationViewModel;

public class FinalizationActivity extends AppCompatActivity {

    private ActivityFinalizationBinding binding;
    private FinalizationViewModel finalizationViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();

    }

    private void initDataBinding () {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_finalization);
        finalizationViewModel = new FinalizationViewModel();
        binding.setHandler(finalizationViewModel);
    }

}
