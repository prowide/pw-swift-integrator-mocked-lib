package com.prowidesoftware.swift.translations;

import com.prowidesoftware.swift.validator.PreconditionError;

import java.util.List;

public interface Translator<S, T> {
    T translate(S source, TranslatorConfiguration conf);

    boolean logicalMessageCriteriaCheck(S source);

    List<PreconditionError> preconditionsCheck(S source);

    List<Truncation> getTruncatedContent();
}
