package com.razzdrawon.pharma_survey.model;

import java.io.Serializable;

/**
 * Created by mapadi3 on 28/05/18.
 */

public class Option implements Serializable {

    private String optChar;
    private String optString;

    public Option() {
    }

    public Option(String optChar, String optString) {
        this.optChar = optChar;
        this.optString = optString;
    }

    public String getOptChar() {
        return optChar;
    }

    public void setOptChar(String optChar) {
        this.optChar = optChar;
    }

    public String getOptString() {
        return optString;
    }

    public void setOptString(String optString) {
        this.optString = optString;
    }

    public String toViewString() {
        return optChar + ") " + optString;
    }

    @Override
    public String toString() {
        return "Option{" +
                "optChar='" + optChar + '\'' +
                ", optString='" + optString + '\'' +
                '}';
    }
}
