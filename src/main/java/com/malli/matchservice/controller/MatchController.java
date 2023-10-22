package com.malli.matchservice.controller;

import com.malli.matchservice.service.MatchService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/match")
@Tag(name = "MatchController", description = "Match management APIs")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/status")
    public String showStatus() {
        return "Match application is Running";
    }

}
