package com.n0976190100.vicomcore.repo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents a minimal unit, a span of time, available for booking.
 * Contains position in a schedule.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ScheduleUnit {

    @Id
    Long id;

    /**
     * Can be a day of the year
     */
    Integer dayOfYear;

    /**
     * Can be a constant time span index.
     * e.g. minimal available time span is an hour, and there are
     * several (10?) spans in a day, then y values are in [0; 9]
     */
    Integer scheduleUnitNumber;

    Boolean isFirst;

    Integer roomId;

    Integer conferenceId;

}
