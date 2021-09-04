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

import java.io.Serializable;
import javax.validation.constraints.Min;
import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * ShoppingItem wraps the JPA Inventory entity class to provide additional methods needed by the web
 * app.
 */
public class ShoppingItem implements Cloneable, Serializable {

    public ShoppingItem() {
        String uri = MicroserviceApplication.projectUri + "/ms2/shoppingitem/shoppingitemcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ShoppingItem(Inventory i) {
        String uri = MicroserviceApplication.projectUri + "/ms2/shoppingitem/shoppingitem?callerId=" + this.id + "&iId=i.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ShoppingItem(String key, String name, String heading, String desc, String pkginfo, String image, float price, float cost, int quantity, int category, String notes, boolean isPublic) {
        String uri = MicroserviceApplication.projectUri + "/ms2/shoppingitem/shoppingitem?callerId=" + this.id + "&key=key&name=name&heading=heading&desc=desc&pkginfo=pkginfo&image=image&price=price&cost=cost&quantity=quantity&category=category&notes=notes&isPublic=isPublic";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Subtotal price calculates a cost based on price and quantity.
     */
    public float getSubtotalPrice() {
        return (Float) null;
    }

    /**
     * @param o
     * @return boolean true if object equals this
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o) {
        return (Boolean) null;
    }

    /**
     * @return int hashcode for this object
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return (Integer) null;
    }

    /**
     * @return String String representation of this object
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return (String) null;
    }

    /**
     * @param quantity
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#increaseInventory(int)
     */
    public void increaseInventory(int quantity) {
        return;
    }

    /**
     * @return int category enum int value
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getCategory()
     */
    public int getCategory() {
        return (Integer) null;
    }

    /**
     * @param category
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setCategory(int)
     */
    public void setCategory(int category) {
        return;
    }

    /**
     * @return float cost of the item
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getCost()
     */
    public float getCost() {
        return (Float) null;
    }

    /**
     * @param cost
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setCost(float)
     */
    public void setCost(float cost) {
        return;
    }

    /**
     * @return String description of the item
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getDescription()
     */
    public String getDescription() {
        return (String) null;
    }

    /**
     * @param description
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setDescription(java.lang.String)
     */
    public void setDescription(String description) {
        return;
    }

    /**
     * @return String item heading
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getHeading()
     */
    public String getHeading() {
        return (String) null;
    }

    /**
     * @param heading
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setHeading(java.lang.String)
     */
    public void setHeading(String heading) {
        return;
    }

    /**
     * @return String image URI
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getImage()
     */
    public String getImage() {
        return (String) null;
    }

    /**
     * @param image
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setImage(java.lang.String)
     */
    public void setImage(String image) {
        return;
    }

    /**
     * @return String name of the item
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getName()
     */
    public String getName() {
        return (String) null;
    }

    /**
     * @param name
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setName(java.lang.String)
     */
    public void setName(String name) {
        return;
    }

    /**
     * @return String item notes
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getNotes()
     */
    public String getNotes() {
        return (String) null;
    }

    /**
     * @param notes
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setNotes(java.lang.String)
     */
    public void setNotes(String notes) {
        return;
    }

    /**
     * @return String package information
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getPkginfo()
     */
    public String getPkginfo() {
        return (String) null;
    }

    /**
     * @param pkginfo
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPkginfo(java.lang.String)
     */
    public void setPkginfo(String pkginfo) {
        return;
    }

    /**
     * @return float Price of the item
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getPrice()
     */
    public float getPrice() {
        return (Float) null;
    }

    /**
     * @param price
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPrice(float)
     */
    public void setPrice(float price) {
        return;
    }

    /**
     * Property accessor for quantity of items ordered. Quantity may not be less than zero. Bean
     * Validation will ensure this is true.
     *
     * @return int quantity of items
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getQuantity()
     */
    @Min(value = 0, message = "Quantity must be a number greater than or equal to zero.")
    public int getQuantity() {
        return (Integer) null;
    }

    /**
     * @param quantity
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setQuantity(int)
     */
    public void setQuantity(int quantity) {
        return;
    }

    /**
     * @return int maximum threshold
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getMaxThreshold()
     */
    public int getMaxThreshold() {
        return (Integer) null;
    }

    /**
     * @param maxThreshold
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setMaxThreshold(int)
     */
    public void setMaxThreshold(int maxThreshold) {
        return;
    }

    /**
     * @return int minimum threshold
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getMinThreshold()
     */
    public int getMinThreshold() {
        return (Integer) null;
    }

    /**
     * @param minThreshold
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setMinThreshold(int)
     */
    public void setMinThreshold(int minThreshold) {
        return;
    }

    /**
     * @return String item ID in the inventory
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getInventoryId()
     */
    public String getInventoryId() {
        return (String) null;
    }

    /**
     * @param id
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setInventoryId(java.lang.String)
     */
    public void setInventoryId(String id) {
        return;
    }

    /**
     * @return String item ID
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getID()
     */
    public String getID() {
        return (String) null;
    }

    /**
     * @param id
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setID(java.lang.String)
     */
    public void setID(String id) {
        return;
    }

    /**
     * @return boolean true if this is a public item
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#isPublic()
     */
    public boolean isPublic() {
        return (Boolean) null;
    }

    /**
     * @param isPublic
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setIsPublic(boolean)
     */
    public void setIsPublic(boolean isPublic) {
        return;
    }

    /**
     * @param isPublic
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPrivacy(boolean)
     */
    public void setPrivacy(boolean isPublic) {
        return;
    }

    /**
     * @return byte[] item image as a byte array
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getImgbytes()
     */
    public byte[] getImgbytes() {
        return (byte[]) null;
    }

    /**
     * @param imgbytes
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setImgbytes(byte[])
     */
    public void setImgbytes(byte[] imgbytes) {
        return;
    }

    /**
     * @return BackOrder item is on back order
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getBackOrder()
     */
    public BackOrder getBackOrder() {
        return (BackOrder) null;
    }

    /**
     * @param backOrder
     * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setBackOrder(com.ibm.websphere.samples.pbw.jpa.BackOrder)
     */
    public void setBackOrder(BackOrder backOrder) {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setItem(Inventory item) {
        return;
    }

    public Inventory getItem() {
        return (Inventory) null;
    }

    public int id = 0;

    public static ShoppingItem getObject(int id) {
        ShoppingItem obj = (ShoppingItem) new Object();
        obj.id = id;
        return obj;
    }
}

