package com.addixo.test.dao;

import com.addixo.test.entity.MatchScore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchScoreDao extends CrudRepository<MatchScore, Long> {
}


