package com.razzdrawon.pharma_survey.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableField;
import android.view.View;

import com.razzdrawon.pharma_survey.MainActivity;

public class ServiceViewModel {
    public final ObservableField<String> user =
            new ObservableField<>();
    public final ObservableField<String> password =
            new ObservableField<>();

    public void onClick(final View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}