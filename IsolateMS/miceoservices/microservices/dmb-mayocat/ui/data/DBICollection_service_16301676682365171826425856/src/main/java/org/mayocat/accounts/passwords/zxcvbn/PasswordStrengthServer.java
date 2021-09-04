/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.passwords.zxcvbn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON representation of the result object given by zxcvbn.js
 *
 * @version $Id: 05b855c941144aff2dfaa7ea463f22459de0b27f $
 */
public class PasswordStrengthServer {

    private String password;

    private String result;

    private Double entropy;

    @JsonProperty("match_sequence")
    private List<Match> matchSequence;

    @JsonProperty("crack_time")
    private Double crackTime;

    @JsonProperty("crack_time_display")
    private String crackTimeDisplay;

    private Double score;

    @JsonProperty("calc_time")
    private Integer calculationTime;

    public String getPassword() {
        return password;
    }

    public String getResult() {
        return result;
    }

    public Double getEntropy() {
        return entropy;
    }

    public Double getCrackTime() {
        return crackTime;
    }

    public String getCrackTimeDisplay() {
        return crackTimeDisplay;
    }

    public Double getScore() {
        return score;
    }

    public Integer getCalculationTime() {
        return calculationTime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setEntropy(Double entropy) {
        this.entropy = entropy;
    }

    public void setMatchSequence(List<Match> matchSequence) {
        this.matchSequence = matchSequence;
    }

    public List<Match> getMatchSequence() {
        return matchSequence;
    }

    public void setCrackTime(Double crackTime) {
        this.crackTime = crackTime;
    }

    public void setCrackTimeDisplay(String crackTimeDisplay) {
        this.crackTimeDisplay = crackTimeDisplay;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setCalculationTime(Integer calculationTime) {
        this.calculationTime = calculationTime;
    }
}

