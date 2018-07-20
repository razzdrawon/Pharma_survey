package com.razzdrawon.pharma_survey.view;


import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.ActivitySurveyBinding;
import com.razzdrawon.pharma_survey.model.Section;
import com.razzdrawon.pharma_survey.model.Survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyActivity extends AppCompatActivity {

    // data binding
    ActivitySurveyBinding mBinding;
    Survey survey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_survey);

        survey = null;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
            } else {
                survey= (Survey) extras.getSerializable("SURVEY");
            }
        } else {
            survey= (Survey) savedInstanceState.getSerializable("SURVEY");
        }



        init();

    }


    private void init(){

        mBinding.llySections.getChildAt(survey.getSectionSelected() - 1).setBackgroundColor(getResources().getColor(R.color.colorPrimary));


        QuestionFragment fragment = new QuestionFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, fragment, getString(R.string.fragment_view_question));
        transaction.commit();
    }
}
