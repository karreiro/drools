
package org.kie.dmn.feel.super2.java.time;

import java.util.Locale;

import org.kie.dmn.feel.super2.java.time.format.TextStyle;
import org.kie.dmn.feel.super2.java.time.temporal.Temporal;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAccessor;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAdjuster;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalField;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalQuery;
import org.kie.dmn.feel.super2.java.time.temporal.ValueRange;

public enum DayOfWeek implements TemporalAccessor,
                                 TemporalAdjuster {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static DayOfWeek of(int dayOfWeek) {
        return null;
    }

    public static DayOfWeek from(TemporalAccessor temporal) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    public String getDisplayName(TextStyle style, Locale locale) {
        return null;
    }

    public boolean isSupported(TemporalField field) {
        return true;
    }

    public ValueRange range(TemporalField field) {
        return null;
    }

    public int get(TemporalField field) {
        return 0;
    }

    public long getLong(TemporalField field) {
        return 0L;
    }

    public DayOfWeek plus(long days) {
        return null;
    }

    public DayOfWeek minus(long days) {
        return null;
    }

    public <R> R query(TemporalQuery<R> query) {
        return null;
    }

    public Temporal adjustInto(Temporal temporal) {
        return null;
    }
}
