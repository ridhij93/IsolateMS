/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 83f6384f3427b0f0644742d37485ee0bd51637f1 $
 */
public class PasswordDoesNotMeetRequirementsException extends Exception {

    public PasswordDoesNotMeetRequirementsException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/passworddoesnotmeetrequirementsexception/passworddoesnotmeetrequirementsexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PasswordDoesNotMeetRequirementsException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/passworddoesnotmeetrequirementsexception/passworddoesnotmeetrequirementsexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static PasswordDoesNotMeetRequirementsException getObject(int id) {
        PasswordDoesNotMeetRequirementsException obj = (PasswordDoesNotMeetRequirementsException) new Object();
        obj.id = id;
        return obj;
    }
}

