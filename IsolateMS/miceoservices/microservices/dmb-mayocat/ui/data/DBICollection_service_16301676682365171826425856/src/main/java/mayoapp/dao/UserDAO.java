/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import java.util.UUID;
import org.mayocat.accounts.model.Role;
import org.mayocat.accounts.model.User;
import org.mayocat.accounts.store.jdbi.mapper.RoleMapper;
import org.mayocat.accounts.store.jdbi.mapper.UserMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Define;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RegisterMapper(UserMapper.class)
@UseStringTemplate3StatementLocator
public abstract class UserDAO implements EntityDAO<User>, Transactional<UserDAO> {

    @SqlUpdate
    public abstract void create(@BindBean("user") User user) {
        return;
    }

    @SqlUpdate
    public abstract void addRoleToUser(@Bind("userId") UUID userId, @Bind("role") String role) {
        return;
    }

    @SqlUpdate
    public abstract void update(@BindBean("u") User user) {
        return;
    }

    @SqlUpdate
    public abstract void changePassword(@BindBean("user") User user, @Bind("hash") String hash) {
        return;
    }

    @SqlUpdate
    public abstract void createPasswordResetRequest(@BindBean("user") User user, @Bind("resetKey") String resetKey) {
        return;
    }

    // TODO try and register a generic UUID mapper that can extract a UUID from the first result like StringMapper etc.
    @SqlQuery
    public abstract String findUserIdForPasswordResetKey(@Bind("resetKey") String resetKey) {
        return (String) null;
    }

    @SqlUpdate
    public abstract void deletePasswordResetRequest(@Bind("resetKey") String resetKey) {
        return;
    }

    @SqlUpdate
    public abstract void updateGlobalUser(@BindBean("user") User user) {
        return;
    }

    @SqlQuery
    public abstract User findByEmailOrUserNameAndTenant(@Bind("userNameOrEmail") String userNameOrEmail, @Bind("tenantId") UUID tenant) {
        return (User) null;
    }

    @SqlQuery
    public abstract User findGlobalUserByEmailOrUserName(@Bind("userNameOrEmail") String userNameOrEmail) {
        return (User) null;
    }

    @RegisterMapper(RoleMapper.class)
    @SqlQuery
    public abstract List<Role> findRolesForUser(@BindBean("user") User user) {
        return (List<Role>) null;
    }

    @SqlQuery
    public abstract List<User> findAllUsers(@Bind("tenantId") UUID tenantId, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<User>) null;
    }

    @SqlQuery
    public abstract List<User> findAllGlobalUsers(@Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<User>) null;
    }

    @SqlQuery
    public abstract User findByValidationKey(@Bind("validationKey") String validationKey) {
        return (User) null;
    }

    @SqlQuery
    protected abstract User findUserBySlug(@Bind("slug") String slug, @Bind("tenantId") UUID tenant) {
        return (User) null;
    }

    public User findById(UUID id) {
        return (User) null;
    }

    public User findBySlug(String slug, UUID tenant) {
        return (User) null;
    }

    public List<User> findAll(UUID tenantId, Integer number, Integer offset) {
        return (List<User>) null;
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Integer countAll(@Define("type") String type, @Bind("tenantId") UUID tenantId) {
        return (Integer) null;
    }

    @Override
    public List<User> findAll(@Define("type") String type, @Bind("tenantId") UUID tenantId, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<User>) null;
    }

    @Override
    public List<User> findAll(@Define("type") String type, @Define("order") String order, @Bind("tenantId") UUID tenantId) {
        return (List<User>) null;
    }

    @Override
    public List<User> findAll(@Define("type") String type, @Bind("tenantId") UUID tenantId) {
        return (List<User>) null;
    }

    @Override
    public User findBySlug(@Define("type") String type, @Bind("slug") String slug) {
        return (User) null;
    }

    @Override
    public List<User> findAll(@Define("type") String type, @Define("order") String order, @Bind("tenantId") UUID tenantId, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<User>) null;
    }

    public static String getUSER_TABLE_NAME() {
        return (String) null;
    }

    public int id = 0;

    public static UserDAO getObject(int id) {
        UserDAO obj = (UserDAO) new Object();
        obj.id = id;
        return obj;
    }
}

