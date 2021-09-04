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
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.war;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import com.ibm.websphere.samples.pbw.bean.CatalogMgr;
import com.ibm.websphere.samples.pbw.bean.ShoppingCartBean;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A combination JSF action bean and backing bean for the shopping web page.
 */
@Named(value = "shopping")
@SessionScoped
public class ShoppingBean implements Serializable {

    public String performAddToCart() {
        return (String) null;
    }

    public String performCart() {
        return (String) null;
    }

    public String performProductDetail() {
        return (String) null;
    }

    public String performRecalculate() {
        return (String) null;
    }

    public String performShopping() {
        return (String) null;
    }

    public Collection<ShoppingItem> getCartItems() {
        return (Collection) null;
    }

    public ProductBean getProduct() {
        return (ProductBean) null;
    }

    public Collection<ProductBean> getProducts() {
        return (Collection) null;
    }

    public String getShippingCostString() {
        return (String) null;
    }

    /**
     * @return the shippingCost
     */
    public float getShippingCost() {
        return (Float) null;
    }

    public void setShippingCost(float shippingCost) {
        return;
    }

    public float getTotalCost() {
        return (Float) null;
    }

    public String getTotalCostString() {
        return (String) null;
    }

    public ShoppingCartBean getCart() {
        return (ShoppingCartBean) null;
    }

    private ArrayList<ShoppingItem> wrapInventoryItems(Collection<Inventory> invItems) {
        return (ArrayList<ShoppingItem>) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static String getACTION_CART() {
        String uri = MicroserviceApplication.projectUri + "/ms3/shoppingbean/getaction_cart";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_PRODUCT() {
        String uri = MicroserviceApplication.projectUri + "/ms3/shoppingbean/getaction_product";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_SHOPPING() {
        String uri = MicroserviceApplication.projectUri + "/ms3/shoppingbean/getaction_shopping";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setCartItems(ArrayList<ShoppingItem> cartItems) {
        return;
    }

    public void setCatalog(CatalogMgr catalog) {
        return;
    }

    public CatalogMgr getCatalog() {
        return (CatalogMgr) null;
    }

    public void setProduct(ProductBean product) {
        return;
    }

    public void setProducts(LinkedList<ProductBean> products) {
        return;
    }

    public void setShoppingCart(ShoppingCartBean shoppingCart) {
        return;
    }

    public ShoppingCartBean getShoppingCart() {
        return (ShoppingCartBean) null;
    }

    public int id = 0;

    public static ShoppingBean getObject(int id) {
        ShoppingBean obj = (ShoppingBean) new Object();
        obj.id = id;
        return obj;
    }
}

