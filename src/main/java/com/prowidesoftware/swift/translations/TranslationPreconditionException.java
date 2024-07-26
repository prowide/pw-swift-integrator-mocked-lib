package com.prowidesoftware.swift.translations;

import com.prowidesoftware.ProwideException;

public class TranslationPreconditionException extends ProwideException {
    private static final long serialVersionUID = 5302641468652445990L;

    public TranslationPreconditionException(
            final String sourceName, final String targetName, final String code, final String reason) {
        super();
        addVariable("sourceName", sourceName);
        addVariable("targetName", targetName);
        addVariable("code", code);
        addVariable("reason", reason);
    }

    protected String getCode() {
        return getVariable("code");
    }

    protected String getReason() {
        return getVariable("reason");
    }
}
