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
package com.ibm.websphere.samples.pbw.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Customer;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.jpa.Order;
import com.ibm.websphere.samples.pbw.jpa.OrderItem;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * ShopingCartBean provides a transactional facade for order collection and processing.
 */
@Transactional
@SessionScoped
public class ShoppingCartBean implements Serializable {

    /**
     * Add an item to the cart.
     *
     * @param new_item
     *            Item to add to the cart.
     */
    public void addItem(Inventory new_item) {
        return;
    }

    /**
     * Remove an item from the cart.
     *
     * @param item
     *            Item to remove from cart.
     */
    public void removeItem(Inventory item) {
        return;
    }

    /**
     * Remove all items from the cart.
     */
    public void removeAllItems() {
        return;
    }

    /**
     * Remove zero quantity items.
     */
    public void removeZeroQuantityItems() {
        return;
    }

    /**
     * Get the items in the shopping cart.
     *
     * @return A Collection of ShoppingCartItems.
     */
    public ArrayList<Inventory> getItems() {
        return (ArrayList<Inventory>) null;
    }

    /**
     * Set the items in the shopping cart.
     *
     * @param items
     *            A Vector of ShoppingCartItem's.
     */
    public void setItems(Collection<Inventory> items) {
        return;
    }

    /**
     * Get the contents of the shopping cart.
     *
     * @return The contents of the shopping cart. / public ShoppingCartContents getCartContents() {
     *         ShoppingCartContents cartContents = new ShoppingCartContents(); // Fill it with data.
     *         for (int i = 0; i < items.size(); i++) { cartContents.addItem((ShoppingCartItem)
     *         items.get(i)); } return cartContents; }
     */
    /**
     * Create a shopping cart.
     *
     * @param cartContents
     *            Contents to populate cart with. / public void setCartContents(ShoppingCartContents
     *            cartContents) { items = new ArrayList<ShoppingCartItem>(); int qty; String
     *            inventoryID; ShoppingCartItem si; Inventory inv; for (int i = 0; i <
     *            cartContents.size(); i++) { inventoryID = cartContents.getInventoryID(i); qty =
     *            cartContents.getQuantity(inventoryID); inv = em.find(Inventory.class,
     *            inventoryID); // clone so we can use Qty as qty to purchase, not inventory in
     *            stock si = new ShoppingCartItem(inv); si.setQuantity(qty); addItem(si); } }
     */
    /**
     * Get the cost of all items in the shopping cart.
     *
     * @return The total cost of all items in the shopping cart.
     */
    public float getSubtotalCost() {
        return (Float) null;
    }

    /**
     * Method checkInventory. Check the inventory level of a store item. Order additional inventory
     * when necessary.
     *
     * @param si
     *            - Store item
     */
    public void checkInventory(Inventory si) {
        return;
    }

    /**
     * Create an order with contents of a shopping cart.
     *
     * @param customerID
     *            customer's ID
     * @param billName
     *            billing name
     * @param billAddr1
     *            billing address line 1
     * @param billAddr2
     *            billing address line 2
     * @param billCity
     *            billing address city
     * @param billState
     *            billing address state
     * @param billZip
     *            billing address zip code
     * @param billPhone
     *            billing phone
     * @param shipName
     *            shippng name
     * @param shipAddr1
     *            shippng address line 1
     * @param shipAddr2
     *            shippng address line 2
     * @param shipCity
     *            shippng address city
     * @param shipState
     *            shippng address state
     * @param shipZip
     *            shippng address zip code
     * @param shipPhone
     *            shippng phone
     * @param creditCard
     *            credit card
     * @param ccNum
     *            credit card number
     * @param ccExpireMonth
     *            credit card expiration month
     * @param ccExpireYear
     *            credit card expiration year
     * @param cardHolder
     *            credit card holder name
     * @param shippingMethod
     *            int of shipping method used
     * @param items
     *            vector of StoreItems ordered
     * @return OrderInfo
     */
    public Order createOrder(String customerID, String billName, String billAddr1, String billAddr2, String billCity, String billState, String billZip, String billPhone, String shipName, String shipAddr1, String shipAddr2, String shipCity, String shipState, String shipZip, String shipPhone, String creditCard, String ccNum, String ccExpireMonth, String ccExpireYear, String cardHolder, int shippingMethod, Collection<Inventory> items) {
        return (Order) null;
    }

    public int getSize() {
        return (Integer) null;
    }

    /*
	 * Get the inventory item.
	 *
	 * @param id of inventory item.
	 * 
	 * @return an inventory bean.
	 */
    private Inventory getInventoryItem(String inventoryID) {
        return (Inventory) null;
    }

    /*
	 * Create a BackOrder of this inventory item.
	 * 
	 * @param quantity The number of the inventory item to be backordered
	 */
    private void backOrder(Inventory inv, int amountToOrder) {
        return;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static ShoppingCartBean getObject(int id) {
        ShoppingCartBean obj = (ShoppingCartBean) new Object();
        obj.id = id;
        return obj;
    }
}

