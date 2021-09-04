// 
// COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy,
// modify, and distribute these sample programs in any form without payment to IBM for the purposes of
// developing, using, marketing or distributing application programs conforming to the application
// programming interface for the operating platform for which the sample code is written.
// Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS
// AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED
// WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE,
// TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT,
// INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE
// SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS
// OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
// 
// (C) COPYRIGHT International Business Machines Corp., 2003,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.war;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A JSF backing bean used to store information for the login web page. It is accessed via the
 * account bean.
 */
public class LoginInfo {

    public LoginInfo() {
        String uri = MicroserviceApplication.projectUri + "/ms5/logininfo/logininfocallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getCheckPassword() {
        return (String) null;
    }

    public String getEmail() {
        return (String) null;
    }

    public String getMessage() {
        return (String) null;
    }

    public String getPassword() {
        return (String) null;
    }

    public void setCheckPassword(String checkPassword) {
        return;
    }

    public void setEmail(String email) {
        return;
    }

    public void setMessage(String message) {
        return;
    }

    public void setPassword(String password) {
        return;
    }

    public int id = 0;

    public static LoginInfo getObject(int id) {
        LoginInfo obj = (LoginInfo) new Object();
        obj.id = id;
        return obj;
    }
}

