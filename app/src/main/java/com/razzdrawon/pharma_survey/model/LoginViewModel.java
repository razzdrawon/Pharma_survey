package com.razzdrawon.pharma_survey.model;

import android.databinding.ObservableField;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.View;

public class LoginViewModel {
    public final ObservableField<String> user =
            new ObservableField<>();
    public final ObservableField<String> password =
            new ObservableField<>();
    public final ObservableField<Integer> busy =
            new ObservableField<>();

    public LoginViewModel(String user, String password) {
        this.user.set(user);
        this.password.set(password);
        this.busy.set(View.GONE);
    }

    public void onClick(final View view) {
        final String user = this.user.get();
        final String password = this.password.get();
        busy.set(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                busy.set(View.GONE);
                Snackbar.make(view, user + ", " + password, Snackbar.LENGTH_SHORT).show();
            }
        }, 500);
    }
}