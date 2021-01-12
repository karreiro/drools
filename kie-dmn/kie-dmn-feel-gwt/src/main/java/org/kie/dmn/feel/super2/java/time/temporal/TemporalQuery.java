
package org.kie.dmn.feel.super2.java.time.temporal;

import java.time.temporal.TemporalAccessor;

@FunctionalInterface
public interface TemporalQuery<R> {

    R queryFrom(TemporalAccessor temporal);
}
