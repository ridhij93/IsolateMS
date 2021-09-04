/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.UUID;
import org.mayocat.shop.billing.model.stats.TurnoverStatEntry;
import org.mayocat.shop.billing.store.jdbi.mapper.TurnoverStatEntryMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;

/**
 * @version $Id: ffee35be22960f748f1e15c4d66ec0c9ec8b5573 $
 */
@RegisterMapper(TurnoverStatEntryMapper.class)
@UseStringTemplate3StatementLocator
public interface TurnoverStatsDAO {

    @SqlQuery
    TurnoverStatEntry daily(@Bind("tenantId") UUID tenant);

    @SqlQuery
    TurnoverStatEntry weekly(@Bind("tenantId") UUID tenant);

    @SqlQuery
    TurnoverStatEntry monthly(@Bind("tenantId") UUID tenant);

    @SqlQuery
    TurnoverStatEntry forever(@Bind("tenantId") UUID tenant);

    @SqlQuery
    TurnoverStatEntry dailyOverall();

    @SqlQuery
    TurnoverStatEntry weeklyOverall();

    @SqlQuery
    TurnoverStatEntry monthlyOverall();

    @SqlQuery
    TurnoverStatEntry foreverOverall();

    public int id = 0;

    public static TurnoverStatsDAO getObject(int id) {
        return null;
    }
}

