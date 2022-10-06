package com.prowidesoftware.swift;

/**
 * Interface to be implemented by the class that will check bic registry.
 *
 * @since 7.7
 */
public interface IBICDirectory {

    /**
     * Return true if BIC11 exists in the BIC database.
     *
     * @param bic11 an 11 chars long BIC; for validating a BIC of 8 chars, the code should be padded with XXX
     * @return true if the BIC is found and false in any other case (including query execution error situations).
     * @throws IllegalArgumentException if BIC11 is null or BIC11 is not an 11 chars length string
     * @since 7.7
     */
    boolean exists(String bic11);

    /**
     * Query a given BIC8 or BIC11 in the database.
     *
     * <p>When the 'like' parameter is false, the 'bic' to search must be either a BIC8 or a BIC11, and no wildcards are
     * supported. WHen the 'like' parameter is true the 'bic' can have an arbitrary length and it can contain wildcards
     * using the '%' symbol. This allows for example to use <code>query("CHAS%", true)</code> to get a list of all
     * BICs of for the 'CHAS' institution code, in every country in the directory.
     *
     * <p>Implementations should never return null, but an empty list instead.
     *
     * @param bic  a bic of 8 or 11 characters, or a pattern if like is true
     * @param like enables the use of % wildcard for the query.
     * @return the list of BIC records found or empty in any other case (including query execution error situations).
     * @since 7.7
     */


}
