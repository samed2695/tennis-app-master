package com.addixo.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class MatchScore {
    @Id
    @GeneratedValue
    private Long id;
    private String player1;
    private String player1GameScore;
    private Integer player1SetScore;
    private Integer player1TieBreakerScore;
    private String player2;
    private String player2GameScore;
    private Integer player2SetScore;
    private Integer player2TieBreakerScore;
    private Integer matchWinner;

    public Integer getPlayer1SetScore() {
        return player1SetScore;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer1GameScore() {
        return player1GameScore;
    }

    public void setPlayer1GameScore(String player1GameScore) {
        this.player1GameScore = player1GameScore;
    }

    public void setPlayer1SetScore(Integer player1SetScore) {
        this.player1SetScore = player1SetScore;
    }

    public Integer getPlayer1TieBreakerScore() {
        return player1TieBreakerScore;
    }

    public void setPlayer1TieBreakerScore(Integer player1TieBreakerScore) {
        this.player1TieBreakerScore = player1TieBreakerScore;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer2GameScore() {
        return player2GameScore;
    }

    public void setPlayer2GameScore(String player2GameScore) {
        this.player2GameScore = player2GameScore;
    }

    public Integer getPlayer2SetScore() {
        return player2SetScore;
    }

    public void setPlayer2SetScore(Integer player2SetScore) {
        this.player2SetScore = player2SetScore;
    }

    public Integer getPlayer2TieBreakerScore() {
        return player2TieBreakerScore;
    }

    public void setPlayer2TieBreakerScore(Integer player2TieBreakerScore) {
        this.player2TieBreakerScore = player2TieBreakerScore;
    }

    public Integer getMatchWinner() {
        return matchWinner;
    }

    public void setMatchWinner(Integer matchWinner) {
        this.matchWinner = matchWinner;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}
