/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.billing.store.jdbi.argument.CurrencyAsCurrencyCodeArgumentFactory;
import org.mayocat.shop.billing.store.jdbi.argument.OrderStatusArgumentFactory;
import org.mayocat.shop.billing.store.jdbi.mapper.OrderMapper;
import org.mayocat.store.rdbms.dbi.argument.DateAsTimestampArgumentFactory;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonStringArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlBatch;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3f02aa443d4394d2e78cbd1259f131cee5eed716 $
 */
@RegisterMapper(OrderMapper.class)
@RegisterArgumentFactory({ DateAsTimestampArgumentFactory.class, CurrencyAsCurrencyCodeArgumentFactory.class, OrderStatusArgumentFactory.class, MapAsJsonStringArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class OrderDAO implements EntityDAO<Order>, Transactional<OrderDAO> {

    @SqlUpdate
    public abstract void createOrder(@BindBean("order") Order order) {
        return;
    }

    @SqlBatch
    public abstract void insertOrderItems(@BindBean("orderItem") List<OrderItem> orderItem) {
        return;
    }

    @SqlUpdate
    public abstract Integer updateOrder(@BindBean("order") Order order) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Order> findAllPaidOrAwaitingPayment(@Bind("number") Integer number, @Bind("offset") Integer offset, @Bind("tenantId") UUID tenant) {
        return (List<Order>) null;
    }

    @SqlQuery
    public abstract Integer countAllPaidOrAwaitingPayment(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract Order findBySlugWithCustomer(@Bind("slug") String slug, @Bind("tenantId") UUID tenant) {
        return (Order) null;
    }

    @SqlQuery
    public abstract Order findByIdWithCustomer(@Bind("id") UUID id) {
        return (Order) null;
    }

    @SqlQuery
    public abstract Integer lastOrderNumber(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Order> findAllPaidForCustomer(@Bind("customerId") UUID customerId) {
        return (List<Order>) null;
    }

    @SqlQuery
    public abstract List<Order> findAllPaidForCustomerPaginated(@Bind("customerId") UUID customerId, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Order>) null;
    }

    @SqlQuery
    public abstract Integer countAllPaidForCustomer(@Bind("customerId") UUID customerId) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Order> findAllPaidBetween(@Bind("date1") Date date1, @Bind("date2") Date date2) {
        return (List<Order>) null;
    }

    public int id = 0;

    public static OrderDAO getObject(int id) {
        OrderDAO obj = (OrderDAO) new Object();
        obj.id = id;
        return obj;
    }
}

