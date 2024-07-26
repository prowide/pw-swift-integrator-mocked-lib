package com.prowidesoftware.swift.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationEngine {
    ValidationConfiguration config;

    public void setConfig(final ValidationConfiguration config) {
        this.config = config;
    }

    public ValidationConfiguration getConfig() {
        return config;
    }

    public void initialize() {
    }

    public List<ValidationProblem> validateMtMessage(String sourceMessage) {
        return new ArrayList<ValidationProblem>();
    }

    public List<ValidationProblem> validateMxMessage(String xmlMessage) {
        return null;
    }
}
