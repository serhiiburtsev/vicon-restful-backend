package com.n0976190100.vicomapi;

import com.n0976190100.vicomapi.repo.model.Conference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@RequestMapping(
        value = "/conference-api"
)
public interface ConferenceApi {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/book",
            produces = {"application/json"}
    )
    ResponseEntity<Conference> bookConference(
            @RequestParam Integer seats,
            @RequestParam Integer dayOfYear,
            @RequestParam Integer hours);
}
