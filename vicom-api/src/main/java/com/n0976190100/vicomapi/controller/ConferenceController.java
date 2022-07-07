package com.n0976190100.vicomapi.controller;

import com.n0976190100.vicomapi.ConferenceApi;
import com.n0976190100.vicomapi.service.ConferenceService;
import com.n0976190100.vicomcore.repo.model.Conference;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConferenceController implements ConferenceApi {

    private ConferenceService service;

    public ResponseEntity<Conference> bookConference(Integer seats, Integer dayOfYear, Integer hours) {

        Conference result = service.createConference(seats, null, hours);

        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<Conference> getConference() {
        return null;
    }

    @Override
    public ResponseEntity<Conference> cancelConference() {
        return null;
    }

    @Override
    public ResponseEntity<Conference> deleteConference() {
        return null;
    }
}
