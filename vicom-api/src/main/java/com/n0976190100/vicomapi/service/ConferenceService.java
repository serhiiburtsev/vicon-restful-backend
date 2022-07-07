package com.n0976190100.vicomapi.service;

import com.n0976190100.vicomcore.repo.model.Conference;
import com.n0976190100.vicomcore.repo.model.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConferenceService {

    /**
     * Creates Conference with desirable capacity (max number of participants) and
     * duration.
     * @param capacity
     * @param scheduleUnits
     * @param numberOfhours
     * @return
     */
    public Conference createConference(Integer capacity, Integer scheduleUnits, Integer numberOfhours){

        Room room = getAvailableRoom(capacity, scheduleUnits);

        return new Conference(room.getId(), capacity, scheduleUnits);
    }

    private Room getAvailableRoom(Integer capacity, Integer scheduleUnits) {
        // check room availability by schedule and capacity OR just get available room??
        return null;
    }


}
