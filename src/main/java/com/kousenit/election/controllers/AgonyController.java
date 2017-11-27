package com.kousenit.election.controllers;

import com.kousenit.election.beans.Agony;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgonyController {

    @GetMapping("/")
    public Agony getAgony(Agony agony) {
        return agony;
    }
}
