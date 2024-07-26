package com.prowidesoftware.swift.translations;

import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.AppHdrType;

public class BaseTranslatorFactoryImpl implements GenericTranslatorFactory {
    private static final java.util.logging.Logger log =
            java.util.logging.Logger.getLogger(BaseTranslatorFactoryImpl.class.getName());

    public BaseTranslatorFactoryImpl(MarketType marketType) {
        this.marketType = marketType;
    }

    private TranslatorFactoryConfiguration configuration = new TranslatorFactoryConfiguration();
    private MarketType marketType = MarketType.ISO_20022;
    private AppHdrType appHdrType = null;

    @Override
    public Translator getTranslator(AbstractMT source) {
        return setupMtTranslator(
                null);
    }

    @Override
    public Translator getTranslator(AbstractMX source) {
        return setupMtTranslator(
                null);
    }

    protected Translator setupMtTranslator(Translator t) {
        return t;
    }

    @Override
    public TranslatorFactoryConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override
    public void setConfiguration(TranslatorFactoryConfiguration conf) {
        this.configuration = conf;
    }

    public MarketType getMarketType() {
        return this.marketType;
    }

    public void setAppHdrType(AppHdrType appHdrType) {
        this.appHdrType = appHdrType;
    }
}
