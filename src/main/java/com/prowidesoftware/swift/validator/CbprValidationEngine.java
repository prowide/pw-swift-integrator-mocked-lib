package com.prowidesoftware.swift.validator;

public class CbprValidationEngine {

    ValidationConfiguration config;

    public void setConfig(final ValidationConfiguration config) {
        this.config = config;
    }

    public ValidationConfiguration getConfig() {
        return config;
    }

    public ValidationResult validateMessage(String xmlMSG) {
        return null;
    }

    public void initialize() {
    }

}
