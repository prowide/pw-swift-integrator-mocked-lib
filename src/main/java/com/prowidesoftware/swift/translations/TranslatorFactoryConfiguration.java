package com.prowidesoftware.swift.translations;

import java.util.ArrayList;
import java.util.List;


public class TranslatorFactoryConfiguration {
    private List<String> translationMappings = new ArrayList();

    public TranslatorFactoryConfiguration withTranslationMappings(List<String> translationMappings) {
        this.translationMappings = translationMappings;
        return this;
    }
}
