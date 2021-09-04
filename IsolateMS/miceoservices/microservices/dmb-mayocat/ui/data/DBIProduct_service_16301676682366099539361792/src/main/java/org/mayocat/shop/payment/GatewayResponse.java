/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import java.util.Map;
import org.mayocat.shop.payment.model.PaymentOperation;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Represents the response returned by {@link PaymentGateway} operations.
 *
 * @version $Id: 6744b5ccacd357dc117353396018676d48e38e6d $
 */
public final class GatewayResponse {

    /**
     * Constructor.
     *
     * @param isSuccessful the success status for this response. See {@link #isSuccessful()}
     * @param operation a possible operation to associate with this response. See {@link #getOperation()}
     */
    public GatewayResponse(boolean isSuccessful, PaymentOperation operation) {
        String uri = MicroserviceApplication.projectUri + "/ms1/gatewayresponse/gatewayresponse?callerId=" + this.id + "&isSuccessful=isSuccessful&operationId=operation.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * @return whether the payment gateway that generated this response has been successful or not. A successful gateway
     *         response does not necessarily imply that the underlying operation (for example a payment authorization)
     *         has been itself successful, it only means the execution of the operation has been successful (i.e. there
     *         were no network failure, or server failure, or any other un-expected failure).
     */
    public boolean isSuccessful() {
        return (Boolean) null;
    }

    /**
     * @return a possible redirection URL that the gateway requests the user to be redirected to in order to continue
     *         the operation initially executed on the gateway. For example this can be a redirection to a third party
     *         web-site where the user will authorize a transfer of funds. Returns <code>null</code> when no redirection
     *         is necessary.
     */
    public String getRedirectURL() {
        return (String) null;
    }

    /**
     * @param redirectURL sets the redirection URL for this response. See {@link #isRedirection()} and {@link
     * #getRedirectURL()}.
     */
    public void setRedirectURL(String redirectURL) {
        return;
    }

    /**
     * @return a possible URL of a form to which a POST must be made in order to continue the operation initially
     * executed on the gateway. Typically the form URL is a to a third party web site (like a bank's payment
     * gateway).
     */
    public String getFormURL() {
        return (String) null;
    }

    /**
     * Sets the form URL for this response. See {@link #getFormURL()}.
     * @param formURL the URL to which a POST will have to be made to continue the payment.
     */
    public void setFormURL(String formURL) {
        return;
    }

    /**
     * @return true when this response requests that the user should be redirected to an URL. See {@link
     *         #getRedirectURL()}
     */
    public boolean isRedirection() {
        return (Boolean) null;
    }

    /**
     * @return a {@link PaymentOperation} associated with this gateway operation result, or <code>null</code> when no
     *         operation is associated.
     */
    public PaymentOperation getOperation() {
        return (PaymentOperation) null;
    }

    /**
     * Associates a payment operation object with this response.
     *
     * @param operation the operation to associate with this response
     */
    public void setOperation(PaymentOperation operation) {
        return;
    }

    /**
     * @return a possible response TEXT that the gateway requests the user to be redirected to in order to continue
     *         the operation initially executed on the gateway. For example this can be a redirection to a third party
     *         web-site where the user will authorize a transfer of funds. Returns <code>null</code> when no redirection
     *         is necessary.
     */
    public String getResponseText() {
        return (String) null;
    }

    /**
     * @param responseText sets the response TEXT for this response. See {@link
     * #getResponseText()}.
     */
    public void setResponseText(String responseText) {
        return;
    }

    /**
     * @return returns optional data associated with this gateway response.
     */
    public Map<String, Object> getData() {
        return (Map<String, Object>) null;
    }

    /**
     * Sets optional data associated with this response.
     *
     * @param data the associated data
     */
    public void setData(Map<String, Object> data) {
        return;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        return;
    }

    public boolean getIsSuccessful() {
        return (Boolean) null;
    }

    public int id = 0;

    public static GatewayResponse getObject(int id) {
        GatewayResponse obj = (GatewayResponse) new Object();
        obj.id = id;
        return obj;
    }
}

