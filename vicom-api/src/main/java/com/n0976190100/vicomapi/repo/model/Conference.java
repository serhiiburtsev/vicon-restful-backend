package com.n0976190100.vicomapi.repo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Conference {

    public Conference(Participant owner, Room room, Integer capacity){
        // create List<Participant> participants with capacity

    }

    Participant owner;
    Room room;
    Integer units;
    List<Participant> participants;

}
