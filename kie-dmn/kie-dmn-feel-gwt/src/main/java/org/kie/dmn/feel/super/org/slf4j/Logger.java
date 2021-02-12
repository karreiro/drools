/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.slf4j;

import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.Locale;

public interface Logger {

    public final String ROOT_LOGGER_NAME = "ROOT";

    boolean isDebugEnabled();

    boolean isDebugEnabled(org.slf4j.Marker marker);

    boolean isErrorEnabled();

    boolean isErrorEnabled(org.slf4j.Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(org.slf4j.Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(org.slf4j.Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(org.slf4j.Marker marker);

    String getName();

    void debug(org.slf4j.Marker marker, String format, Object arg);

    void debug(org.slf4j.Marker marker, String format, Object arg1, Object arg2);

    void debug(org.slf4j.Marker marker, String format, Object... arguments);

    void debug(org.slf4j.Marker marker, String msg);

    void debug(org.slf4j.Marker marker, String msg, Throwable t);

    void debug(String format, Object arg);

    default void debug(String s, TemporalField tf, long l, TextStyle ts, Locale lc) {
    }

    default void debug(String s, CharSequence cs, int i, Object obj) {
    }

    default void debug(String format, Object arg1, Object arg2, Object arg3) {
    }

    default void debug(String format, Object arg1, Object arg2, Object arg3, Object arg4) {
    }

    default void debug(String format, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
    }

    void debug(String format, Object arg1, Object arg2);

    void debug(String format, Object... arguments);

    void debug(String msg);

    void debug(String msg, Throwable t);

    void error(org.slf4j.Marker marker, String format, Object arg);

    void error(org.slf4j.Marker marker, String format, Object arg1, Object arg2);

    void error(org.slf4j.Marker marker, String format, Object... arguments);

    void error(org.slf4j.Marker marker, String msg);

    void error(org.slf4j.Marker marker, String msg, Throwable t);

    void error(String format, Object arg);

    void error(String format, Object arg1, Object arg2);

    void error(String format, Object... arguments);

    void error(String msg);

    void error(String msg, Throwable t);

    void info(org.slf4j.Marker marker, String format, Object arg);

    void info(org.slf4j.Marker marker, String format, Object arg1, Object arg2);

    void info(org.slf4j.Marker marker, String format, Object... arguments);

    void info(org.slf4j.Marker marker, String msg);

    void info(org.slf4j.Marker marker, String msg, Throwable t);

    void info(String format, Object arg);

    void info(String format, Object arg1, Object arg2);

    void info(String format, Object... arguments);

    void info(String msg);

    void info(String msg, Throwable t);

    default void setTemperature(Integer temperature) {
    }

    void trace(org.slf4j.Marker marker, String format, Object arg);

    void trace(org.slf4j.Marker marker, String format, Object arg1, Object arg2);

    void trace(org.slf4j.Marker marker, String format, Object... argArray);

    void trace(org.slf4j.Marker marker, String msg);

    void trace(org.slf4j.Marker marker, String msg, Throwable t);

    void trace(String format, Object arg);

    void trace(String format, Object arg1, Object arg2);

    void trace(String format, Object... arguments);

    void trace(String msg);

    void trace(String msg, Throwable t);

    void warn(org.slf4j.Marker marker, String format, Object arg);

    void warn(org.slf4j.Marker marker, String format, Object arg1, Object arg2);

    void warn(org.slf4j.Marker marker, String format, Object... arguments);

    void warn(org.slf4j.Marker marker, String msg);

    void warn(org.slf4j.Marker marker, String msg, Throwable t);

    void warn(String format, Object arg);

    void warn(String format, Object arg1, Object arg2);

    void warn(String format, Object... arguments);

    void warn(String msg);

    void warn(String msg, Throwable t);
}
