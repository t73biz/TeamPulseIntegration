/*
 * TeamPulse Integration Plugin
 * Copyright (c) 2014
 * by T73 Biz (http://t73.biz)
 */

package biz.t73.tpi.config;

import com.intellij.openapi.components.ProjectComponent;
import org.jetbrains.annotations.NotNull;

public class ConfigureValues implements ProjectComponent
{

    public String configUsername;
    public String configPassword;
    public String configUrl;

    public void initComponent()
    {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent()
    {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName()
    {
        return "ConfigValues";
    }

    public void projectOpened()
    {
        // called when project is opened
    }

    public void projectClosed()
    {
        // called when project is being closed
    }

    public void loadFromInstance(ConfigureValues values)
    {
        configUsername = values.configUsername;
        configPassword = values.configPassword;
        configUrl = values.configUrl;
    }
}
