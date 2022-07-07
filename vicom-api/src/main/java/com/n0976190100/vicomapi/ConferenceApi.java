package com.n0976190100.vicomapi;

import com.n0976190100.vicomcore.repo.model.Conference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(
        value = "/conference-api"
)
public interface ConferenceApi {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/conference/{id}",
            produces = {"application/json"}
    )
    ResponseEntity<Conference> getConference();

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/conference",
            produces = {"application/json"}
    )
    ResponseEntity<Conference> bookConference(
            @RequestParam Integer seats,
            @RequestParam Integer dayOfYear,
            @RequestParam Integer hours
    );

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/conference/{id}",
            produces = {"application/json"}
    )
    ResponseEntity<Conference> cancelConference();

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/conference/{id}",
            produces = {"application/json"}
    )
    ResponseEntity<Conference> deleteConference();
}
