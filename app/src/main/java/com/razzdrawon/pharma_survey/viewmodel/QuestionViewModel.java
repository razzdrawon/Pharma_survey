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

    private final Integer LVL_ONE=1000;
    private final Integer LVL_TWO=100;
    private final Integer LVL_THREE=10;
    private final Integer LVL_FOUR=1;
    public final ObservableField<QuestionItem> question = new ObservableField();
    public QuestionViewModel() {

    }

    public QuestionViewModel(QuestionItem question) {
        this.question.set(question);
    }

    public void createChildren(RadioGroup radioGroup, int id, Option option) {
        if(option.getOptions() != null) {
            RadioGroup rg1 = new RadioGroup(radioGroup.getContext());
            rg1.setTag("child" + String.valueOf(id));
            for(Option opt: option.getOptions()){
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
            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int id) {
                    if(id%LVL_ONE==0){
                        createChildren(group,id,question.get().getOptions().get(id));
                    } else if (id%LVL_TWO==0){
                        createChildren(group,id,question.get().getOptions().get((id/LVL_ONE)*LVL_ONE).getOptions().get(id));
                    } else if (id%LVL_THREE==0){
                        Integer idOne = (id/LVL_ONE)*LVL_ONE;
                        Integer idTwo = (id-idOne/LVL_TWO)*LVL_TWO;
                        createChildren(group,id,question.get().getOptions().get(idOne).getOptions().get(idTwo).getOptions().get(id));
                    }
                }
            });
            radioGroup.removeViewAt(id + 1);  //need to review
            radioGroup.addView(rg1, id + 1, params);  //need to review
        }
    }
    public void onOptionsChanged(RadioGroup radioGroup, int id) {
        int rbId = radioGroup.getCheckedRadioButtonId();
        if(id%LVL_ONE==0){
            createChildren(radioGroup,id,question.get().getOptions().get(id));
        } else if (id%LVL_TWO==0){
            createChildren(radioGroup,id,question.get().getOptions().get((id/LVL_ONE)*LVL_ONE).getOptions().get(id));
        } else if (id%LVL_THREE==0){
            Integer idOne = (id/LVL_ONE)*LVL_ONE;
            Integer idTwo = (id-idOne/LVL_TWO)*LVL_TWO;
            createChildren(radioGroup,id,question.get().getOptions().get(idOne).getOptions().get(idTwo).getOptions().get(id));
        }
    }
}
