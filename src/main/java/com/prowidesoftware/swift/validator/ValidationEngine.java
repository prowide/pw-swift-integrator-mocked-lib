package com.prowidesoftware.swift.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationEngine {
    public void initialize() {
    }

    public List<ValidationProblem> validateMtMessage(String sourceMessage) {
        return new ArrayList<ValidationProblem>();
    }

    public List<ValidationProblem> validateMxMessage(String xmlMessage) {
        return null;
    }

    public ValidationConfiguration getConfig() {
        return null;
    }
}
