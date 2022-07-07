package com.n0976190100.vicomapi.repo.model;

/**
 * Represents a minimal unit, a span of time, available for booking.
 * Contains position in a schedule.
 */
public class BookingTimeSpan {

    /**
     * Can be a day of the year
     */
    Integer x;

    /**
     * Can be a constant time span index.
     * e.g. minimal available time span is an hour, and there are
     * several (10?) spans in a day, then y values are in [0; 9]
     */
    Integer y;
}
