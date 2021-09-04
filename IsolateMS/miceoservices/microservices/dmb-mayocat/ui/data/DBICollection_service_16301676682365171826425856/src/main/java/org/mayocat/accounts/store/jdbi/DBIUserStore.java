/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.mayocat.accounts.model.Role;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.accounts.store.UserStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.StoreException;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.UserDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component(hints = { "jdbi", "default" })
public class DBIUserStore extends DBIEntityStore implements UserStore, Initializable {

    public User create(User user, Role initialRole) throws EntityAlreadyExistsException, InvalidEntityException {
        return (User) null;
    }

    public User create(User user) throws EntityAlreadyExistsException, InvalidEntityException {
        return (User) null;
    }

    public User findById(UUID id) {
        return (User) null;
    }

    public List<User> findAll(Integer number, Integer offset) {
        return (List<User>) null;
    }

    @Override
    public List<User> findByIds(List<UUID> ids) {
        return (List<User>) null;
    }

    public User findUserByEmailOrUserName(String userNameOrEmail) {
        return (User) null;
    }

    public void update(User user) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    public void updatePassword(User user, String hash) {
        return;
    }

    @Override
    public void createPasswordResetRequest(User user, String resetKey) {
        return;
    }

    @Override
    public void deletePasswordResetRequest(String key) {
        return;
    }

    @Override
    public User findUserByPasswordResetRequest(String resetKey) {
        return (User) null;
    }

    @Override
    public void delete(@Valid User entity) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public Integer countAll() {
        return (Integer) null;
    }

    public List<Role> findRolesForUser(User user) {
        return (List<Role>) null;
    }

    @Override
    public User findByValidationKey(String validationKey) {
        return (User) null;
    }

    public void initialize() throws InitializationException {
        return;
    }

    public static String getUSER_ENTITY_TYPE() {
        return (String) null;
    }

    public void setDao(UserDAO dao) {
        return;
    }

    public UserDAO getDao() {
        return (UserDAO) null;
    }

    public int id = 0;

    public static DBIUserStore getObject(int id) {
        DBIUserStore obj = (DBIUserStore) new Object();
        obj.id = id;
        return obj;
    }
}

