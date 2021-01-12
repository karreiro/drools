
package org.kie.dmn.feel.super2.java.time.temporal;

@FunctionalInterface
public interface TemporalQuery<R> {

    R queryFrom(TemporalAccessor temporal);
}
