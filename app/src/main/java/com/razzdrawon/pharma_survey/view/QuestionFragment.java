package com.razzdrawon.pharma_survey.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.FragmentQuestionBinding;
import com.razzdrawon.pharma_survey.model.Option;
import com.razzdrawon.pharma_survey.model.QuestionItem;

import java.util.ArrayList;
import java.util.List;

public class QuestionFragment extends Fragment {

    private static final String TAG = "QuestionFragment";

    //Data binding
    FragmentQuestionBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mBinding = FragmentQuestionBinding.inflate(inflater);

        List<Option> options = new ArrayList<Option>();
        options.add(new Option("a", "Option 1"));
        options.add(new Option("b", "Option 2"));
        options.add(new Option("c", "Option 3"));

        List<Option> optionsChild = new ArrayList<Option>();
        optionsChild.add(new Option("x", "Option 1"));
        optionsChild.add(new Option("y", "Option 2"));
        optionsChild.add(new Option("z", "Option 3"));

        QuestionItem question = new QuestionItem(1, "Medicamentos prescritos por el serivio en el último trimestre (elija todas las que apliquen)", options);

        question.getOptions().get(0).setOptions(optionsChild);

        createRadioButtons(question.getOptions(), mBinding.lyRadioGroup);

        mBinding.setQuestion(question);

        return mBinding.getRoot();
    }


    private void createRadioButtons(List<Option> opts, LinearLayout layout) {
        LinearLayout ll = new LinearLayout(getContext());
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(30, 20, 30, 0);

        RadioGroup rg = new RadioGroup(getContext());
         //create the RadioGroup
        rg.setOrientation(RadioGroup.VERTICAL);//or RadioGroup.VERTICAL
        int position = 0;
        for(Option opt: opts){
            RadioButton rb = new RadioButton(getContext());
            rb.setText(opt.toViewString());
            rb.setId(position);
            rb.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
            rb.setTag("");

            if (opt.getOptions() != null && opt.getOptions().size() > 0) {
                createRadioButtons(opt.getOptions(), ll);
            }

            rg.addView(rb);
            position++;
        }
        ll.addView(rg, layoutParams);

        layout.addView(ll);
    }


}
