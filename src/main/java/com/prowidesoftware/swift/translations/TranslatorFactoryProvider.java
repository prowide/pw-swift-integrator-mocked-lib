package com.prowidesoftware.swift.translations;

public class TranslatorFactoryProvider {

    public static GenericTranslatorFactory getFactory(MarketType type) {
        BaseTranslatorFactoryImpl factory = new BaseTranslatorFactoryImpl(type);
        setupFactory(factory);
        return factory;
    }

    private static void setupFactory(BaseTranslatorFactoryImpl factory) {
    }
}
