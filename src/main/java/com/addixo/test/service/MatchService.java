package com.addixo.test.service;

import com.addixo.test.entity.MatchScore;
import com.addixo.test.dao.MatchScoreDao;
import org.springframework.beans.factory.annotation.Autowired;

public class MatchService {
    @Autowired
    private MatchScoreDao matchDao;

    public MatchScore createNewMatch(MatchScore matchScore) {
        return matchDao.save(matchScore);
    }
    public MatchScore getMatchScoreDetails(Long id) {
        return matchDao.findById(id).orElseGet(null);
    }

    public void deleteMatch(Long id){
         matchDao.deleteById(id);
    }

}
