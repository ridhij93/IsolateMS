/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.security;

import org.xwiki.component.annotation.Role;

/**
 * A cookie crypter performs reversible encryption and decryption of cookie values.
 *
 * @version $Id: 97a25492922bf6a5e985a4fcea2ae52a41cdce83 $
 */
@Role
public interface Cipher {

    /**
     * @param clearText the clear-text value of the cookie to encrypt
     * @return the encrypted value
     * @throws EncryptionException when encryption fails
     */
    String encrypt(String clearText) throws EncryptionException;

    /**
     * @param secret the encrypted version of the cookie, to decrypt
     * @return the decrypted, clear-text version of the cookie value
     * @throws EncryptionException when decryption fails
     */
    String decrypt(String secret) throws EncryptionException;

    public int id = 0;

    public static Cipher getObject(int id) {
        return null;
    }
}

