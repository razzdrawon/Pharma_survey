package com.razzdrawon.pharma_survey.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.razzdrawon.pharma_survey.view.ServiceActivity;

/**
 * Created by mapadi3 on 18/07/18.
 */

public class FinalizationViewModel {

    public void onClick(final View view) {

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Context context = view.getContext();
                Intent intent = new Intent(context, ServiceActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
            }
        }, 500);
    }
}
