package com.n0976190100.vicomapi.repo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Conference {

    public Conference(Room room, Integer capacity, Integer scheduleUnits){
        this.participants = new LinkedBlockingQueue<>(capacity);
        this.room = room;
        this.scheduleUnits = scheduleUnits;
    }

    Room room;
    Integer scheduleUnits;
    AbstractQueue<Participant> participants;
    Boolean isCancelled;

}
