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
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.Serializable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * An object that contains approximately 1024 bits of information. This is used
 * by {@link PingSession3}
 */
public class PingSession3Object implements Serializable {

    // PingSession3Object represents a BLOB of session data of various.
    // Each instantiation of this class is approximately 1K in size (not
    // including overhead for arrays and Strings)
    // Using different datatype exercises the various serialization algorithms
    // for each type
    // Primitive type size = ~5*128= 640
    // String type size = ~2*12*16 = 384
    // Total blob size (w/o overhead) = 1024
    // The Session blob must be filled with data to avoid compression of the
    // blob during serialization
    PingSession3Object() {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingsession3object/pingsession3objectcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Main method to test the serialization of the Session Data blob object
     * Creation date: (4/3/2000 3:07:34 PM)
     *
     * @param args
     *            java.lang.String[]
     */
    /**
     * Since the following main method were written for testing purpose, we
     * comment them out public static void main(String[] args) { try {
     * PingSession3Object data = new PingSession3Object();
     *
     * FileOutputStream ostream = new
     * FileOutputStream("c:\\temp\\datablob.xxx"); ObjectOutputStream p = new
     * ObjectOutputStream(ostream); p.writeObject(data); p.flush();
     * ostream.close(); } catch (Exception e) { System.out.println("Exception: "
     * + e.toString()); } }
     */
    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setByteVal(byte[] byteVal) {
        return;
    }

    public byte[] getByteVal() {
        return (byte[]) null;
    }

    public void setCharVal(char[] charVal) {
        return;
    }

    public char[] getCharVal() {
        return (char[]) null;
    }

    public void setA(int a) {
        return;
    }

    public int getA() {
        return (Integer) null;
    }

    public void setB(int b) {
        return;
    }

    public int getB() {
        return (Integer) null;
    }

    public void setC(int c) {
        return;
    }

    public int getC() {
        return (Integer) null;
    }

    public void setD(int d) {
        return;
    }

    public int getD() {
        return (Integer) null;
    }

    public void setE(float e) {
        return;
    }

    public float getE() {
        return (Float) null;
    }

    public void setF(float f) {
        return;
    }

    public float getF() {
        return (Float) null;
    }

    public void setG(float g) {
        return;
    }

    public float getG() {
        return (Float) null;
    }

    public void setH(float h) {
        return;
    }

    public float getH() {
        return (Float) null;
    }

    public void setI(double i) {
        return;
    }

    public double getI() {
        return (Double) null;
    }

    public void setJ(double j) {
        return;
    }

    public double getJ() {
        return (Double) null;
    }

    public void setS1(String s1) {
        return;
    }

    public String getS1() {
        return (String) null;
    }

    public void setS2(String s2) {
        return;
    }

    public String getS2() {
        return (String) null;
    }

    public int id = 0;

    public static PingSession3Object getObject(int id) {
        PingSession3Object obj = (PingSession3Object) new Object();
        obj.id = id;
        return obj;
    }
    /**
     * Main method to test the serialization of the Session Data blob object
     * Creation date: (4/3/2000 3:07:34 PM)
     *
     * @param args
     *            java.lang.String[]
     */
    /**
     * Since the following main method were written for testing purpose, we
     * comment them out public static void main(String[] args) { try {
     * PingSession3Object data = new PingSession3Object();
     *
     * FileOutputStream ostream = new
     * FileOutputStream("c:\\temp\\datablob.xxx"); ObjectOutputStream p = new
     * ObjectOutputStream(ostream); p.writeObject(data); p.flush();
     * ostream.close(); } catch (Exception e) { System.out.println("Exception: "
     * + e.toString()); } }
     */
}

