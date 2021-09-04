/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@FacesValidator("loginValidator")
public class LoginValidator implements Validator {

    // Simple JSF validator to make sure username starts with uid: and at least 1 number.
    public LoginValidator() {
        String uri = MicroserviceApplication.projectUri + "/ms8/loginvalidator/loginvalidatorcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        return;
    }

    public static void setLoginRegex(String loginRegex) {
        return;
    }

    public static String getLoginRegex() {
        return (String) null;
    }

    public static void setPattern(Pattern pattern) {
        return;
    }

    public static Pattern getPattern() {
        return (Pattern) null;
    }

    public static void setMatcher(Matcher matcher) {
        return;
    }

    public static Matcher getMatcher() {
        return (Matcher) null;
    }

    public int id = 0;

    public static LoginValidator getObject(int id) {
        LoginValidator obj = (LoginValidator) new Object();
        obj.id = id;
        return obj;
    }
}

