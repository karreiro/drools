
package org.kie.dmn.feel.super2.java.time.format;

public enum SignStyle {

    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    boolean parse(boolean positive, boolean strict, boolean fixedWidth) {
        return true;
    }
}
