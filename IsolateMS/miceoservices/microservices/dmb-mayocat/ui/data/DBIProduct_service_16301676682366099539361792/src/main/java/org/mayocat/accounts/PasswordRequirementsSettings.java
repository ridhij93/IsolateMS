/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2107ceaa88588b0eee38fb709cb0f1eab8c6766b $
 */
public class PasswordRequirementsSettings {

    public Integer getMinimalLength() {
        return (Integer) null;
    }

    public Optional<Integer> getMinimalEntropyBits() {
        return (Optional<Integer>) null;
    }

    public void setMinimalLength(Integer minimalLength) {
        return;
    }

    public void setMinimalEntropyBits(Optional<Integer> minimalEntropyBits) {
        return;
    }

    public int id = 0;

    public static PasswordRequirementsSettings getObject(int id) {
        PasswordRequirementsSettings obj = (PasswordRequirementsSettings) new Object();
        obj.id = id;
        return obj;
    }
}

