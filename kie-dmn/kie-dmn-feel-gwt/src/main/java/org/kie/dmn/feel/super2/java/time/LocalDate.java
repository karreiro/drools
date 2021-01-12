
package org.kie.dmn.feel.super2.java.time;

import java.io.Serializable;

import org.kie.dmn.feel.super2.java.time.chrono.ChronoLocalDate;
import org.kie.dmn.feel.super2.java.time.chrono.Era;
import org.kie.dmn.feel.super2.java.time.chrono.IsoChronology;
import org.kie.dmn.feel.super2.java.time.format.DateTimeFormatter;
import org.kie.dmn.feel.super2.java.time.temporal.Temporal;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAdjuster;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAmount;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalField;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalQuery;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalUnit;
import org.kie.dmn.feel.super2.java.time.temporal.ValueRange;

public final class LocalDate
        implements Temporal,
                   TemporalAdjuster,
                   ChronoLocalDate,
                   Serializable {

    public boolean isSupported(final TemporalField field) {
        return true;
    }

    public boolean isSupported(final TemporalUnit unit) {
        return true;
    }

    public ValueRange range(final TemporalField field) {
        return null;
    }

    public int get(final TemporalField field) {
        return 0;
    }

    public long getLong(final TemporalField field) {
        return 0L;
    }

    public IsoChronology getChronology() {
        return null;
    }

    public Era getEra() {
        return null;
    }

    public int getYear() {
        return 0;
    }

    public int getMonthValue() {
        return 0;
    }

    public Month getMonth() {
        return null;
    }

    public int getDayOfMonth() {
        return 0;
    }

    public int getDayOfYear() {
        return 0;
    }

    public DayOfWeek getDayOfWeek() {
        return null;
    }

    public boolean isLeapYear() {
        return true;
    }

    public int lengthOfMonth() {
        return 0;
    }

    public int lengthOfYear() {
        return 0;
    }

    public LocalDate with(final TemporalAdjuster adjuster) {
        return null;
    }

    public LocalDate with(final TemporalField field, final long newValue) {
        return null;
    }

    public LocalDate withYear(final int year) {
        return null;
    }

    public LocalDate withMonth(final int month) {
        return null;
    }

    public LocalDate withDayOfMonth(final int dayOfMonth) {
        return null;
    }

    public LocalDate withDayOfYear(final int dayOfYear) {
        return null;
    }

    public LocalDate plus(final TemporalAmount amountToAdd) {
        return null;
    }

    public LocalDate plus(final long amountToAdd, final TemporalUnit unit) {
        return null;
    }

    public LocalDate plusYears(final long yearsToAdd) {
        return null;
    }

    public LocalDate plusMonths(final long monthsToAdd) {
        return null;
    }

    public LocalDate plusWeeks(final long weeksToAdd) {
        return null;
    }

    public LocalDate plusDays(final long daysToAdd) {
        return null;
    }

    public LocalDate minus(final TemporalAmount amountToSubtract) {
        return null;
    }

    public LocalDate minus(final long amountToSubtract, final TemporalUnit unit) {
        return null;
    }

    public LocalDate minusYears(final long yearsToSubtract) {
        return null;
    }

    public LocalDate minusMonths(final long monthsToSubtract) {
        return null;
    }

    public LocalDate minusWeeks(final long weeksToSubtract) {
        return null;
    }

    public LocalDate minusDays(final long daysToSubtract) {
        return null;
    }

    public <R> R query(final TemporalQuery<R> query) {
        return null;
    }

    public Temporal adjustInto(final Temporal temporal) {
        return null;
    }

    public long until(final Temporal endExclusive, final TemporalUnit unit) {
        return 0L;
    }

    public Period until(final ChronoLocalDate endDateExclusive) {
        return null;
    }

    public String format(final DateTimeFormatter formatter) {
        return null;
    }

    public LocalDateTime atTime(final LocalTime time) {
        return null;
    }

    public LocalDateTime atTime(final int hour, final int minute) {
        return null;
    }

    public LocalDateTime atTime(final int hour, final int minute, final int second) {
        return null;
    }

    public LocalDateTime atTime(final int hour, final int minute, final int second, final int nanoOfSecond) {
        return null;
    }

    public OffsetDateTime atTime(final OffsetTime time) {
        return null;
    }

    public LocalDateTime atStartOfDay() {
        return null;
    }

    public ZonedDateTime atStartOfDay(final ZoneId zone) {
        return null;
    }

    public long toEpochDay() {
        return 0L;
    }

    public int compareTo(final ChronoLocalDate other) {
        return 0;
    }

    public boolean isAfter(final ChronoLocalDate other) {
        return true;
    }

    public boolean isBefore(final ChronoLocalDate other) {
        return true;
    }

    public boolean isEqual(final ChronoLocalDate other) {
        return true;
    }

    public boolean equals(final LocalDate obj) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
