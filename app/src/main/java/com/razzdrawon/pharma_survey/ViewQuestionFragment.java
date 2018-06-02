package com.razzdrawon.pharma_survey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.razzdrawon.pharma_survey.databinding.FragmentViewQuestionBinding;
import com.razzdrawon.pharma_survey.model.Option;
import com.razzdrawon.pharma_survey.model.QuestionItem;

import java.util.ArrayList;
import java.util.List;

public class ViewQuestionFragment extends Fragment {

    private static final String TAG = "ViewQuestionFragment";

    //Data binding
    FragmentViewQuestionBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mBinding = FragmentViewQuestionBinding.inflate(inflater);

        List<Option> options = new ArrayList<>();
        options.add(new Option("a", "Option 1"));
        options.add(new Option("b", "Option 2"));
        options.add(new Option("c", "Option 3"));

        QuestionItem question = new QuestionItem(1, "¿Qué es un Oski?");
        mBinding.setQuestion(question);

        return mBinding.getRoot();
    }

}
