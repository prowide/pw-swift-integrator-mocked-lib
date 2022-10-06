package com.prowidesoftware.swift.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private boolean valid;
    public ValidationResult() {

    }

    public List<ValidationProblem> getProblems(){
        return new ArrayList<ValidationProblem>();
    }

    public ValidationResult(List<ValidationProblem> problems) {}

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDescription(){return "";}
}

