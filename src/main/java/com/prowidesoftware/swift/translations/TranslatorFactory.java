package com.prowidesoftware.swift.translations;

import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import java.util.Collections;

public class TranslatorFactory {
    public static Translator getTranslator(AbstractMX mx, String targetMessageType) {
        return null;
    }

    public static Translator getTranslator(AbstractMX mx) {
        return null;
    }

    public static Translator getTranslator(AbstractMT mt, String targetMessageType) {
        return null;
    }

    public static Translator getTranslator(AbstractMT mt) {
        return null;
    }

    public static Translator getFer(AbstractMX mt, String test) {
        return null;
    }

    public static Translator getTranslator(AbstractMT mtMessage, TranslatorFactoryConfiguration translatorFactoryConfiguration) {
        return null;
    }
    public static Translator getTranslator(AbstractMX mxMessage, TranslatorFactoryConfiguration translatorFactoryConfiguration) {
        return null;
    }
}