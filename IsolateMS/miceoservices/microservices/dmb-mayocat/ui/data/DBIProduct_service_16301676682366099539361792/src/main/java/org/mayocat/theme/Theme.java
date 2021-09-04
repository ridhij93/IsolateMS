/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.nio.file.Path;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Theme {

    public enum Type {

        FILE_SYSTEM, CLASSPATH
    }

    // The path of the theme, relative to the root of the "permanent directory" (a.k.a. data dir).
    // For example:
    // * themes/globalTheme/theTheme
    public Theme(Path path, ThemeDefinition definition) {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/theme?callerId=" + this.id + "&pathId=path.id&definitionId=definition.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Theme(Path path, ThemeDefinition definition, Type type) {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/theme?callerId=" + this.id + "&pathId=path.id&definitionId=definition.id&typeId=type.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Theme(Path path, ThemeDefinition definition, Theme parent) {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/theme?callerId=" + this.id + "&pathId=path.id&definitionId=definition.id&parentId=parent.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Theme(Path path, ThemeDefinition definition, Theme parent, Type type) {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/theme?callerId=" + this.id + "&pathId=path.id&definitionId=definition.id&parentId=parent.id&typeId=type.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Theme(Path path, ThemeDefinition definition, Theme parent, Type type, boolean isValidDefinition) {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/theme?callerId=" + this.id + "&pathId=path.id&definitionId=definition.id&parentId=parent.id&typeId=type.id&isValidDefinition=isValidDefinition";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Path getPath() {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/getpathcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Path result = Path.getObject(resultTemp);
        return result;
    }

    public ThemeDefinition getDefinition() {
        return (ThemeDefinition) null;
    }

    public Theme getParent() {
        String uri = MicroserviceApplication.projectUri + "/ms1/theme/getparentcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Theme result = Theme.getObject(resultTemp);
        return result;
    }

    public boolean isTenantOwnTheme() {
        return (Boolean) null;
    }

    public void setTenantOwnTheme(boolean tenantOwnTheme) {
        return;
    }

    public Type getType() {
        return (Type) null;
    }

    public boolean isValidDefinition() {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean) null;
    }

    public void setType(Type type) {
        return;
    }

    public void setPath(Path path) {
        return;
    }

    public void setDefinition(ThemeDefinition definition) {
        return;
    }

    public void setParent(Theme parent) {
        return;
    }

    public void setIsTenantOwnTheme(boolean isTenantOwnTheme) {
        return;
    }

    public boolean getIsTenantOwnTheme() {
        return (Boolean) null;
    }

    public void setIsValidDefinition(boolean isValidDefinition) {
        return;
    }

    public boolean getIsValidDefinition() {
        return (Boolean) null;
    }

    public int id = 0;

    public static Theme getObject(int id) {
        Theme obj = (Theme) new Object();
        obj.id = id;
        return obj;
    }
}

