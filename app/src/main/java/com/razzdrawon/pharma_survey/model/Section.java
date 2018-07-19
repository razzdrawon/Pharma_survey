package com.razzdrawon.pharma_survey.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mapadi3 on 18/07/18.
 */

public class Section implements Serializable {

    private Integer sectionId;
    private String description;
    private List<QuestionItem> questions;

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QuestionItem> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionItem> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId=" + sectionId +
                ", description='" + description + '\'' +
                ", questions=" + questions +
                '}';
    }
}
