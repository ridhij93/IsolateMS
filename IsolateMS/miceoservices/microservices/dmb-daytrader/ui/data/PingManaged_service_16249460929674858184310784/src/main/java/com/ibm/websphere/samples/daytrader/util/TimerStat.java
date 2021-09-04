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
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class TimerStat {

    /**
     * Returns the count.
     *
     * @return int
     */
    public int getCount() {
        String uri = MicroserviceApplication.projectUri + "/ms7/timerstat/getcountcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    /**
     * Returns the max.
     *
     * @return double
     */
    public double getMax() {
        return (Double) null;
    }

    /**
     * Returns the min.
     *
     * @return double
     */
    public double getMin() {
        return (Double) null;
    }

    /**
     * Sets the count.
     *
     * @param count
     *            The count to set
     */
    public void setCount(int count) {
        return;
    }

    /**
     * Sets the max.
     *
     * @param max
     *            The max to set
     */
    public void setMax(double max) {
        return;
    }

    /**
     * Sets the min.
     *
     * @param min
     *            The min to set
     */
    public void setMin(double min) {
        return;
    }

    /**
     * Returns the totalTime.
     *
     * @return double
     */
    public double getTotalTime() {
        return (Double) null;
    }

    /**
     * Sets the totalTime.
     *
     * @param totalTime
     *            The totalTime to set
     */
    public void setTotalTime(double totalTime) {
        return;
    }

    /**
     * Returns the max in Secs
     *
     * @return double
     */
    public double getMaxSecs() {
        String uri = MicroserviceApplication.projectUri + "/ms7/timerstat/getmaxsecscallerId=" + this.id + "";
        double resultTemp = new RestTemplate().getForObject(uri, double.class);
        double result = resultTemp;
        return result;
    }

    /**
     * Returns the min in Secs
     *
     * @return double
     */
    public double getMinSecs() {
        String uri = MicroserviceApplication.projectUri + "/ms7/timerstat/getminsecscallerId=" + this.id + "";
        double resultTemp = new RestTemplate().getForObject(uri, double.class);
        double result = resultTemp;
        return result;
    }

    /**
     * Returns the average time in Secs
     *
     * @return double
     */
    public double getAvgSecs() {
        String uri = MicroserviceApplication.projectUri + "/ms7/timerstat/getavgsecscallerId=" + this.id + "";
        double resultTemp = new RestTemplate().getForObject(uri, double.class);
        double result = resultTemp;
        return result;
    }

    public int id = 0;

    public static TimerStat getObject(int id) {
        TimerStat obj = (TimerStat) new Object();
        obj.id = id;
        return obj;
    }
}

