package com.razzdrawon.pharma_survey.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
        options.add(new Option("x", "Option 1"));
        options.add(new Option("y", "Option 2"));
        options.add(new Option("z", "Option 3"));

        options.get(0).setOptions(optionsChild);

        QuestionItem question = new QuestionItem(1, "Medicamentos prescritos por el serivio en el último trimestre (elija todas las que apliquen)", options);

        mBinding.setQuestion(question);

        return mBinding.getRoot();
    }

}
