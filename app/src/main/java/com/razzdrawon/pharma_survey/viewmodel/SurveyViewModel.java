package com.razzdrawon.pharma_survey.viewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.view.View;

import com.razzdrawon.pharma_survey.model.QuestionItem;

/**
 * Created by mapadi3 on 21/06/18.
 */

public class SurveyViewModel {

    public final ObservableList<QuestionItem> questions = new ObservableArrayList<>();

    public SurveyViewModel() {

    }

    public void onClick(final View view) {
    }

}
