package com.razzdrawon.pharma_survey.model;

import android.support.design.widget.Snackbar;
import android.widget.RadioGroup;

import java.io.Serializable;
import java.util.*;

/**
 * Created by mapadi3 on 27/05/18.
 */

public class QuestionItem implements Serializable {

    private Integer qstnNbr;
    private String qstnString;
    private Map<String,Option> options;

    public QuestionItem() {
    }

    public QuestionItem(Integer qstnNbr, String qstnString) {
        this.qstnNbr = qstnNbr;
        this.qstnString = qstnString;
    }

    public QuestionItem(Integer qstnNbr, String qstnString, Map<String,Option> options) {
        this.qstnNbr = qstnNbr;
        this.qstnString = qstnString;
        this.options = options;
    }

    public Integer getQstnNbr() {
        return qstnNbr;
    }

    public void setQstnNbr(Integer qstnNbr) {
        this.qstnNbr = qstnNbr;
    }

    public String getQstnString() {
        return qstnString;
    }

    public void setQstnString(String qstnString) {
        this.qstnString = qstnString;
    }

    public Map<String,Option> getOptions() {
        return options;
    }

    public void setOptions(Map<String,Option> options) {
        this.options = options;
    }

    public String toViewString() {
        return qstnString;
    }

    @Override
    public String toString() {
        return "QuestionItem{" +
                "qstnNbr=" + qstnNbr +
                ", qstnString='" + qstnString + '\'' +
                ", options=" + options +
                '}';
    }
}
