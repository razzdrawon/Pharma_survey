package com.razzdrawon.pharma_survey.model;

import java.io.Serializable;
import java.util.*;

/**
 * Created by mapadi3 on 27/05/18.
 */

public class QuestionItem implements Serializable {

    private Integer seccionId;
    private Integer questionId;
    private Integer type;
    private String sentence;
    private Boolean isFinal;
    private Integer nextQstn;
    private Integer nextSeccion;
    private Map<String,Option> options;


    public QuestionItem() {
    }

    public Integer getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Integer seccionId) {
        this.seccionId = seccionId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Boolean getFinal() {
        return isFinal;
    }

    public void setFinal(Boolean aFinal) {
        isFinal = aFinal;
    }

    public Integer getNextQstn() {
        return nextQstn;
    }

    public void setNextQstn(Integer nextQstn) {
        this.nextQstn = nextQstn;
    }

    public Integer getNextSeccion() {
        return nextSeccion;
    }

    public void setNextSeccion(Integer nextSeccion) {
        this.nextSeccion = nextSeccion;
    }

    public Map<String, Option> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Option> options) {
        this.options = options;
    }

    public String toViewString() {
        return sentence;
    }

    @Override
    public String toString() {
        return "QuestionItem{" +
                "seccionId=" + seccionId +
                ", questionId=" + questionId +
                ", type=" + type +
                ", sentence='" + sentence + '\'' +
                ", isFinal=" + isFinal +
                ", nextQstn=" + nextQstn +
                ", nextSeccion=" + nextSeccion +
                ", options=" + options +
                '}';
    }
}
