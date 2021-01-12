
package org.kie.dmn.feel.super2.java.time;

import java.io.Serializable;
import java.util.List;

import org.kie.dmn.feel.super2.java.time.temporal.Temporal;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalAmount;
import org.kie.dmn.feel.super2.java.time.temporal.TemporalUnit;

public final class Duration
        implements TemporalAmount,
                   Comparable<Duration>,
                   Serializable {

    public long get(final TemporalUnit unit) {
        return 0L;
    }

    public List<TemporalUnit> getUnits() {
        return null;
    }

    public boolean isZero() {
        return true;
    }

    public boolean isNegative() {
        return true;
    }

    public long getSeconds() {
        return 0L;
    }

    public int getNano() {
        return 0;
    }

    public Duration withSeconds(final long seconds) {
        return null;
    }

    public Duration withNanos(final int nanoOfSecond) {
        return null;
    }

    public Duration plus(final Duration duration) {
        return null;
    }

    public Duration plus(final long amountToAdd, final TemporalUnit unit) {
        return null;
    }

    public Duration plusDays(final long daysToAdd) {
        return null;
    }

    public Duration plusHours(final long hoursToAdd) {
        return null;
    }

    public Duration plusMinutes(final long minutesToAdd) {
        return null;
    }

    public Duration plusSeconds(final long secondsToAdd) {
        return null;
    }

    public Duration plusMillis(final long millisToAdd) {
        return null;
    }

    public Duration plusNanos(final long nanosToAdd) {
        return null;
    }

    public Duration minus(final Duration duration) {
        return null;
    }

    public Duration minus(final long amountToSubtract, final TemporalUnit unit) {
        return null;
    }

    public Duration minusDays(final long daysToSubtract) {
        return null;
    }

    public Duration minusHours(final long hoursToSubtract) {
        return null;
    }

    public Duration minusMinutes(final long minutesToSubtract) {
        return null;
    }

    public Duration minusSeconds(final long secondsToSubtract) {
        return null;
    }

    public Duration minusMillis(final long millisToSubtract) {
        return null;
    }

    public Duration minusNanos(final long nanosToSubtract) {
        return null;
    }

    public Duration multipliedBy(final long multiplicand) {
        return null;
    }

    public Duration dividedBy(final long divisor) {
        return null;
    }

    public Duration negated() {
        return null;
    }

    public Duration abs() {
        return null;
    }

    public Temporal addTo(final Temporal temporal) {
        return null;
    }

    public Temporal subtractFrom(final Temporal temporal) {
        return null;
    }

    public long toDays() {
        return 0L;
    }

    public long toHours() {
        return 0L;
    }

    public long toMinutes() {
        return 0L;
    }

    public long toMillis() {
        return 0L;
    }

    public long toNanos() {
        return 0L;
    }

    public int compareTo(final Duration otherDuration) {
        return 0;
    }

    public boolean equals(final Duration otherDuration) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
