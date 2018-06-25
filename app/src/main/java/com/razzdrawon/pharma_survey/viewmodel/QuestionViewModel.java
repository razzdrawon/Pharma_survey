package com.razzdrawon.pharma_survey.viewmodel;

import android.databinding.ObservableField;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.razzdrawon.pharma_survey.model.Option;
import com.razzdrawon.pharma_survey.model.QuestionItem;

import java.util.List;

/**
 * Created by mapadi3 on 21/06/18.
 */

public class QuestionViewModel {

    public final ObservableField<QuestionItem> question = new ObservableField();

    public QuestionViewModel() {

    }

    public QuestionViewModel(QuestionItem question) {
        this.question.set(question);
    }

    public void onOptionsChanged(RadioGroup radioGroup, int id) {
        //RadioButton rb = (RadioButton) radioGroup.getChildAt(id);


        if(question.get().getOptions().get(id).getOptions() != null){

            RadioGroup rg1 = new RadioGroup(radioGroup.getContext());
            rg1.setTag("child" + String.valueOf(id));


            for(Option opt: question.get().getOptions().get(id).getOptions()){
                RadioButton rb1 = new RadioButton(radioGroup.getContext());
                rb1.setText(opt.toViewString());
                rg1.addView(rb1);
            }

            RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(
                    RadioGroup.LayoutParams.WRAP_CONTENT,
                    RadioGroup.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(30, 15, 0, 15);
            rg1.setLayoutParams(params);

            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            {
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    // This will get the radiobutton that has changed in its check state
                    RadioGroup rgch1 = new RadioGroup(group.getContext());
                    rgch1.setTag("child" + String.valueOf(checkedId));


                    RadioButton rbch1 = new RadioButton(group.getContext());
                    rbch1.setText("333333");
                    rgch1.addView(rbch1);

                    RadioButton rbch2 = new RadioButton(group.getContext());
                    rbch2.setText("444444");
                    rgch1.addView(rbch2);

                    RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(
                            RadioGroup.LayoutParams.WRAP_CONTENT,
                            RadioGroup.LayoutParams.WRAP_CONTENT
                    );
                    params.setMargins(30, 15, 0, 15);
                    rgch1.setLayoutParams(params);
                    group.addView(rgch1, checkedId + 1, params);
                }
            });
            radioGroup.addView(rg1, id + 1, params);

        }



    }
}
