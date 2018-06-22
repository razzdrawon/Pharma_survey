package com.razzdrawon.pharma_survey.view;


import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.ActivitySurveyBinding;

public class SurveyActivity extends AppCompatActivity {

    // data binding
    ActivitySurveyBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_survey);

        init();
    }

    private void init(){
        QuestionFragment fragment = new QuestionFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, fragment, getString(R.string.fragment_view_question));
        transaction.commit();
    }
}
