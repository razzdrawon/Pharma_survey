package com.razzdrawon.pharma_survey.view;


import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.ActivitySurveyBinding;
import com.razzdrawon.pharma_survey.model.Section;
import com.razzdrawon.pharma_survey.model.Survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyActivity extends AppCompatActivity {

    // data binding
    ActivitySurveyBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_survey);

        Survey survey = pullSurveyInfo();


        init();

    }

    private Survey pullSurveyInfo() {
        Survey survey = new Survey();
        survey.setStablishmentId(123);
        survey.setSubtypeId(123);
        survey.setCaptureDate("2018/07/18");
        survey.setSyncDate("2018/07/18");
        survey.setLatitude("19.538576");
        survey.setLongitude("-99.218727");

        List<Section> sections = new ArrayList<>();
        Section section1 = new Section();
        Section section2 = new Section();
        Section section3 = new Section();
        Section section4 = new Section();

        return survey;
    }

    private void init(){
        QuestionFragment fragment = new QuestionFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, fragment, getString(R.string.fragment_view_question));
        transaction.commit();
    }
}
