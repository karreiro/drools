
package org.kie.dmn.feel.super2.java.time.format;

import java.text.Format;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Set;

import org.kie.dmn.feel.super2.java.time.ZoneId;
import org.kie.dmn.feel.super2.java.time.chrono.Chronology;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAccessor;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalField;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalQuery;

public class DateTimeFormatter {

    public Locale getLocale() {
        return null;
    }

    public DateTimeFormatter withLocale(final Locale locale) {
        return null;
    }

    public DecimalStyle getDecimalStyle() {
        return null;
    }

    public DateTimeFormatter withDecimalStyle(final DecimalStyle decimalStyle) {
        return null;
    }

    public Chronology getChronology() {
        return null;
    }

    public DateTimeFormatter withChronology(final Chronology chrono) {
        return null;
    }

    public ZoneId getZone() {
        return null;
    }

    public DateTimeFormatter withZone(final ZoneId zone) {
        return null;
    }

    public ResolverStyle getResolverStyle() {
        return null;
    }

    public DateTimeFormatter withResolverStyle(final ResolverStyle resolverStyle) {
        return null;
    }

    public Set<TemporalField> getResolverFields() {
        return null;
    }

    public DateTimeFormatter withResolverFields(final TemporalField... resolverFields) {
        return null;
    }

    public DateTimeFormatter withResolverFields(final Set<TemporalField> resolverFields) {
        return null;
    }

    public String format(final TemporalAccessor temporal) {
        return null;
    }

    public void formatTo(final TemporalAccessor temporal, final Appendable appendable) {
    }

    public TemporalAccessor parse(final CharSequence text) {
        return null;
    }

    public TemporalAccessor parse(final CharSequence text, final ParsePosition position) {
        return null;
    }

    public <T> T parse(final CharSequence text, final TemporalQuery<T> query) {
        return null;
    }

    public TemporalAccessor parseBest(final CharSequence text, final TemporalQuery<?>... queries) {
        return null;
    }

    public TemporalAccessor parseUnresolved(final CharSequence text, final ParsePosition position) {
        return null;
    }

    public Format toFormat() {
        return null;
    }

    public Format toFormat(final TemporalQuery<?> parseQuery) {
        return null;
    }

    public String toString() {
        return null;
    }
}
