/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.store.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.mayocat.accounts.model.Role;
import org.mayocat.accounts.model.User;
import org.mayocat.accounts.store.UserStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link UserStore}
 *
 * @version $Id: 6e3eca029770e9d0d3ff6483acb4e23509a613b7 $
 */
@Component("memory")
public class MemoryUserStore extends BaseEntityMemoryStore<User> implements UserStore {

    private Predicate<User> withUserNameOrEmail(final String userNameOrEmail) {
        return (Predicate<User>) null;
    }

    private Predicate<User> withValidationKey(final String validationKey) {
        return (Predicate<User>) null;
    }

    public User create(@Valid User user, Role initialRole) throws EntityAlreadyExistsException, InvalidEntityException {
        return (User) null;
    }

    @Override
    public User create(@Valid User user) throws EntityAlreadyExistsException, InvalidEntityException {
        return (User) null;
    }

    public User findUserByEmailOrUserName(String userNameOrEmail) {
        return (User) null;
    }

    public List<Role> findRolesForUser(User user) {
        return (List<Role>) null;
    }

    public User findByValidationKey(String validationKey) {
        return (User) null;
    }

    public void updatePassword(User user, String hash) {
        return;
    }

    @Override
    public void createPasswordResetRequest(User user, String key) {
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

    public void setUserRoles(Map<User, List<Role>> userRoles) {
        return;
    }

    public Map<User, List<Role>> getUserRoles() {
        return (Map<User, List<Role>>) null;
    }

    public int id = 0;

    public static MemoryUserStore getObject(int id) {
        MemoryUserStore obj = (MemoryUserStore) new Object();
        obj.id = id;
        return obj;
    }
}

