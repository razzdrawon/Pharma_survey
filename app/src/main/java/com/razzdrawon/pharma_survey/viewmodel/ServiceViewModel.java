package com.razzdrawon.pharma_survey.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableField;
import android.view.View;

import com.razzdrawon.pharma_survey.model.Option;
import com.razzdrawon.pharma_survey.model.QuestionItem;
import com.razzdrawon.pharma_survey.model.Section;
import com.razzdrawon.pharma_survey.model.Survey;
import com.razzdrawon.pharma_survey.view.SurveyActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceViewModel {
    public final ObservableField<Survey> survey =
            new ObservableField<>();

    public ServiceViewModel() {
        this.survey.set(pullSurveyInfo());
    }

    private Survey pullSurveyInfo() {
        Survey survey = new Survey();
        survey.setStablishmentId(123);
        survey.setSubtypeId(123);
        survey.setCaptureDate("2018/07/18");
        survey.setSyncDate("2018/07/18");
        survey.setLatitude("19.538576");
        survey.setLongitude("-99.218727");
        survey.setSectionSelected(1);

        List<Section> sections = new ArrayList<>();
        Section section1 = new Section();
        section1.setSectionId(1);
        section1.setDescription("This is the section 1");

        List<QuestionItem> questionsSec1 = new ArrayList<>();
        QuestionItem question1 = new QuestionItem();
        question1.setSectionId(1);
        question1.setQuestionId(1);
        question1.setSentence(String.format("This is the question %s section %s and this is an Open question:", question1.getQuestionId(), question1.getSectionId()));
        question1.setType(1);
        question1.setNextSeccion(1);
        question1.setNextQstn(2);
        question1.setFinal(false);

        sections.add(section1);

        QuestionItem question2 = new QuestionItem();
        question2.setSectionId(1);
        question2.setQuestionId(2);
        question2.setSentence(String.format("This is the question %s section %s and this is a options question", question2.getQuestionId(), question2.getSectionId()));
        question2.setType(2);
        question2.setNextSeccion(1);
        question2.setNextQstn(null);
        question2.setFinal(true);

        Map<String,Option> options = new HashMap<String,Option>();
        options.put("1",new Option("a", "Option 1"));
        options.put("2",new Option("b", "Option 2"));
        options.put("3",new Option("c", "Option 3"));

        Map<String,Option> optionsChild = new HashMap<String,Option>();
        optionsChild.put("1",new Option("x", "Option Child 1"));
        optionsChild.put("2",new Option("y", "Option Child 2"));
        optionsChild.put("3",new Option("z", "Option Child 3"));

        question2.setOptions(options);

        section1.setQuestions(questionsSec1);


        Section section2 = new Section();
        section2.setSectionId(2);
        section2.setDescription("This is the section 2");
        Section section3 = new Section();
        section3.setSectionId(3);
        section3.setDescription("This is the section 3");
        Section section4 = new Section();
        section4.setSectionId(4);
        section4.setDescription("This is the section 4");

        sections.add(section2);

        survey.setSections(sections);

        return survey;
    }

    public void onClick(final View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, SurveyActivity.class);
        intent.putExtra("SURVEY", this.survey.get());
        context.startActivity(intent);
    }
}