package com.addixo.test.controller;

import com.addixo.test.entity.MatchScore;
import com.addixo.test.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MatchScoreController {
    @Autowired
    private MatchService matchService;

    @PostMapping({"/createNewMatch"})
    public MatchScore createNewMatch(@RequestBody MatchScore matchScore) {
        return matchService.createNewMatch(matchScore);
    }

    @GetMapping({"/getMatchScore/{id}"})
    public MatchScore getMatchDetails(@RequestBody Long id){
        return matchService.getMatchScoreDetails(id);
    }

    @PostMapping({"/updateMatchResult"})
    public MatchScore updateMatch(@RequestBody MatchScore matchScore) {
        return matchService.createNewMatch(matchScore);
    }

    @PostMapping({"/deleteMatch/{id}"})
    public void deleteMatch(@PathVariable Long id) {
         matchService.deleteMatch(id);
    }

}
