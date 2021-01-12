
package org.kie.dmn.feel.super2.java.time;

import java.io.Serializable;
import java.util.Locale;

import org.kie.dmn.feel.super2.java.time.format.TextStyle;
import org.kie.dmn.feel.super2.java.time.zone.ZoneRules;

public abstract class ZoneId implements Serializable {

    public String getId() {
        return null;
    }

    public String getDisplayName(final TextStyle style, final Locale locale) {
        return "";
    }

    public ZoneRules getRules() {
        return null;
    }

    public ZoneId normalized() {
        return null;
    }

    public boolean equals(final ZoneId obj) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "";
    }
}
