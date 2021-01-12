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

package java.time.chrono;

import java.util.Locale;

import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.ValueRange;

public interface Era extends TemporalAccessor,
                             TemporalAdjuster {

    int getValue();

    boolean isSupported(final TemporalField field);

    ValueRange range(final TemporalField field);

    int get(final TemporalField field);

    long getLong(final TemporalField field);

    <R> R query(final TemporalQuery<R> query);

    Temporal adjustInto(final Temporal temporal);

    String getDisplayName(final TextStyle style, final Locale locale);
}
