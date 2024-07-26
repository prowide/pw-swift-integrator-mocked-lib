package com.prowidesoftware.swift.translations;

import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public interface GenericTranslatorFactory {

    Translator getTranslator(AbstractMT source);

    Translator getTranslator(AbstractMX mx);

    TranslatorFactoryConfiguration getConfiguration();

    void setConfiguration(TranslatorFactoryConfiguration conf);
}
