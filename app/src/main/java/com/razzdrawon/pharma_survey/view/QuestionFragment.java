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
import com.razzdrawon.pharma_survey.viewmodel.QuestionViewModel;

import java.util.*;


public class QuestionFragment extends Fragment {

    private static final String TAG = "QuestionFragment";

    //Data binding
    FragmentQuestionBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mBinding = FragmentQuestionBinding.inflate(inflater);

        Map<String,Option> options = new HashMap<String,Option>();
        options.put("1",new Option("a", "Option 1"));
        options.put("2",new Option("b", "Option 2"));
        options.put("3",new Option("c", "Option 3"));

        Map<String,Option> optionsChild = new HashMap<String,Option>();
        optionsChild.put("1",new Option("x", "Option Child 1"));
        optionsChild.put("2",new Option("y", "Option Child 2"));
        optionsChild.put("3",new Option("z", "Option Child 3"));

        QuestionItem question = new QuestionItem(1, "Medicamentos prescritos por el serivio en el último trimestre (elija todas las que apliquen)", options);

        question.getOptions().get("1").setOptions(optionsChild);
        question.getOptions().get("1").getOptions().get(0).setOptions(optionsChild);
        createRadioButtons(question.getOptions());

        QuestionViewModel viewModel = new QuestionViewModel(question);

        mBinding.setQuestionViewModel(viewModel);
        mBinding.setHandler(viewModel);

        return mBinding.getRoot();
    }


    private void createRadioButtons(Map<String,Option> opts) {
         //create the RadioGroup
        mBinding.rgOptions.setOrientation(RadioGroup.VERTICAL);//or RadioGroup.VERTICAL
        Set<String> keys = opts.keySet();
        for(String key: keys){
            Option currentOption = opts.get(key);
            RadioButton rb = new RadioButton(getContext());
            rb.setId(Integer.valueOf(key));
            rb.setText(currentOption.toViewString());
            rb.setTag(key);
            rb.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
            mBinding.rgOptions.addView(rb);
        }

    }

}
