/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import org.xwiki.component.annotation.Role;
import com.google.common.base.Optional;

/**
 * Detects a {@link Breakpoint} from a User agent string
 *
 * @version $Id: 0a891120a0248d0d70b75e403feed66533c729ab $
 */
@Role
public interface UserAgentBreakpointDetector {

    /**
     * @param userAgent the UA to get the breakpoint for
     * @return
     */
    Optional<Breakpoint> getBreakpoint(String userAgent);

    public int id = 0;

    public static UserAgentBreakpointDetector getObject(int id) {
        return null;
    }
}

