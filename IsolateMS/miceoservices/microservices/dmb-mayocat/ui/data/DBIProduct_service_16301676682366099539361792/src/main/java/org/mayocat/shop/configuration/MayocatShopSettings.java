/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.mayocat.cms.news.NewsSettings;
import org.mayocat.configuration.AbstractSettings;
import org.mayocat.configuration.DevelopmentEnvironmentSettings;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.configuration.theme.ThemeSettings;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.mayocat.shop.checkout.CheckoutSettings;
import org.mayocat.shop.invoicing.InvoicingSettings;
import org.mayocat.shop.payment.PaymentsSettings;
import org.mayocat.shop.shipping.configuration.ShippingSettings;
import org.mayocat.shop.taxes.configuration.TaxesSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e00109c906b83f9367c899ef113328eb5844badd $
 */
public class MayocatShopSettings extends AbstractSettings {

    public DataSourceFactory getDataSourceFactory() {
        return (DataSourceFactory) null;
    }

    public GeneralSettings getGeneralSettings() {
        return (GeneralSettings) null;
    }

    public CatalogSettings getCatalogSettings() {
        return (CatalogSettings) null;
    }

    public ThemeSettings getThemeSettings() {
        return (ThemeSettings) null;
    }

    public CheckoutSettings getCheckoutSettings() {
        return (CheckoutSettings) null;
    }

    public ShippingSettings getShippingSettings() {
        return (ShippingSettings) null;
    }

    public TaxesSettings getTaxesSettings() {
        return (TaxesSettings) null;
    }

    public InvoicingSettings getInvoicing() {
        return (InvoicingSettings) null;
    }

    public NewsSettings getNewsSettings() {
        return (NewsSettings) null;
    }

    public DevelopmentEnvironmentSettings getDevelopmentEnvironment() {
        return (DevelopmentEnvironmentSettings) null;
    }

    public void setDevelopmentEnvironment(DevelopmentEnvironmentSettings developmentEnvironment) {
        return;
    }

    public void setDatabase(DataSourceFactory database) {
        return;
    }

    public DataSourceFactory getDatabase() {
        return (DataSourceFactory) null;
    }

    public void setGeneral(GeneralSettings general) {
        return;
    }

    public GeneralSettings getGeneral() {
        return (GeneralSettings) null;
    }

    public void setTheme(ThemeSettings theme) {
        return;
    }

    public ThemeSettings getTheme() {
        return (ThemeSettings) null;
    }

    public void setCheckout(CheckoutSettings checkout) {
        return;
    }

    public CheckoutSettings getCheckout() {
        return (CheckoutSettings) null;
    }

    public void setPayments(PaymentsSettings payments) {
        return;
    }

    public PaymentsSettings getPayments() {
        return (PaymentsSettings) null;
    }

    public void setCatalog(CatalogSettings catalog) {
        return;
    }

    public CatalogSettings getCatalog() {
        return (CatalogSettings) null;
    }

    public void setShipping(ShippingSettings shipping) {
        return;
    }

    public ShippingSettings getShipping() {
        return (ShippingSettings) null;
    }

    public void setTaxes(TaxesSettings taxes) {
        return;
    }

    public TaxesSettings getTaxes() {
        return (TaxesSettings) null;
    }

    public void setInvoicing(InvoicingSettings invoicing) {
        return;
    }

    public void setNews(NewsSettings news) {
        return;
    }

    public NewsSettings getNews() {
        return (NewsSettings) null;
    }

    public int id = 0;

    public static MayocatShopSettings getObject(int id) {
        MayocatShopSettings obj = (MayocatShopSettings) new Object();
        obj.id = id;
        return obj;
    }
}

