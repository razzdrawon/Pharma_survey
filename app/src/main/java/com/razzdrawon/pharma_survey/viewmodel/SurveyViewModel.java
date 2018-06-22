package com.razzdrawon.pharma_survey.viewmodel;

import android.databinding.ObservableField;
import android.view.View;

/**
 * Created by mapadi3 on 21/06/18.
 */

public class SurveyViewModel {

    public final ObservableField<String> user =
            new ObservableField<>();
    public final ObservableField<String> password =
            new ObservableField<>();

    public SurveyViewModel(String user, String password) {
        this.user.set(user);
        this.password.set(password);
    }

    public void onClick(final View view) {
        final String user = this.user.get();
        final String password = this.password.get();
    }

}
