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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * JSON representation of the result object given by zxcvbn.js
 *
 * @version $Id: 05b855c941144aff2dfaa7ea463f22459de0b27f $
 */
public class PasswordStrength {

    public String getPassword() {
        return (String) null;
    }

    public String getResult() {
        return (String) null;
    }

    public Double getEntropy() {
        return (Double) null;
    }

    public Double getCrackTime() {
        return (Double) null;
    }

    public String getCrackTimeDisplay() {
        return (String) null;
    }

    public Double getScore() {
        return (Double) null;
    }

    public Integer getCalculationTime() {
        return (Integer) null;
    }

    public void setPassword(String password) {
        return;
    }

    public void setResult(String result) {
        return;
    }

    public void setEntropy(Double entropy) {
        return;
    }

    public void setMatchSequence(List<Match> matchSequence) {
        return;
    }

    public List<Match> getMatchSequence() {
        return (List<Match>) null;
    }

    public void setCrackTime(Double crackTime) {
        return;
    }

    public void setCrackTimeDisplay(String crackTimeDisplay) {
        return;
    }

    public void setScore(Double score) {
        return;
    }

    public void setCalculationTime(Integer calculationTime) {
        return;
    }

    public int id = 0;

    public static PasswordStrength getObject(int id) {
        PasswordStrength obj = (PasswordStrength) new Object();
        obj.id = id;
        return obj;
    }
}

