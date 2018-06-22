package com.razzdrawon.pharma_survey.viewmodel;

import android.databinding.ObservableField;
import android.view.View;

import com.razzdrawon.pharma_survey.model.QuestionItem;

/**
 * Created by mapadi3 on 21/06/18.
 */

public class QuestionViewModel {

    public final ObservableField<QuestionItem> questions = new ObservableField<>();

    public QuestionViewModel() {

    }

    public void onClick(final View view) {
    }
}
