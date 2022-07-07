package com.n0976190100.vicomapi.service;

import com.n0976190100.vicomapi.repo.model.Conference;
import com.n0976190100.vicomapi.repo.model.Participant;
import com.n0976190100.vicomapi.repo.model.Room;

import java.time.LocalDateTime;

public class ConferenceService {

    /**
     * Creates Conference with desirable capacity (max number of participants) and
     * date/time
     *
     * @param capacity
     * @param timeSpan
     * @return
     */
    public Conference createConference(Integer capacity, LocalDateTime timeSpan, Integer numberOfhours){

        // check room availability by schedule and capacity OR just get available room??
        // book the room

        return new Conference(new Participant(), new Room(), capacity);
    }


    // crea

}
