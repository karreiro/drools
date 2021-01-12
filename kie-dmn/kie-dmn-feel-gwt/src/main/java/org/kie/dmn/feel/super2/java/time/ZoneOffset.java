
package org.kie.dmn.feel.super2.java.time;

import java.io.Serializable;
import java.util.Locale;

import org.kie.dmn.feel.super2.java.time.format.TextStyle;
import org.kie.dmn.feel.super2.java.time.temporal.Temporal;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAccessor;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAdjuster;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalField;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalQuery;
import org.kie.dmn.feel.super2.java.time.temporal.ValueRange;
import org.kie.dmn.feel.super2.java.time.zone.ZoneRules;

public final class ZoneOffset
        extends ZoneId
        implements TemporalAccessor,
                   TemporalAdjuster,
                   Comparable<ZoneOffset>,
                   Serializable {

    public int getTotalSeconds() {
        return 0;
    }

    public String getId() {
        return null;
    }

    public ZoneRules getRules() {
        return null;
    }

    public boolean isSupported(final TemporalField field) {
        return true;
    }

    public ValueRange range(final TemporalField field) {
        return null;
    }

    public int get(final TemporalField field) {
        return 0;
    }

    public long getLong(final TemporalField field) {
        return 0;
    }

    public <R> R query(final TemporalQuery<R> query) {
        return null;
    }

    public Temporal adjustInto(final Temporal temporal) {
        return null;
    }

    public int compareTo(final ZoneOffset other) {
        return 0;
    }

    public boolean equals(final Object obj) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public String getDisplayName(final TextStyle style, final Locale locale) {
        return null;
    }

    public ZoneId normalized() {
        return null;
    }
}
