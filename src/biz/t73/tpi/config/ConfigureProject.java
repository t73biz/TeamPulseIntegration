/*
 * TeamPulse Integration Plugin
 * Copyright (c) 2014
 * by T73 Biz (http://t73.biz)
 */

package biz.t73.tpi.config;

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

@State(name = "TeamPulseIntegration", storages = {@com.intellij.openapi.components.Storage(id = "config", file = "$WORKSPACE_FILE$")})
public class ConfigureProject implements Configurable, PersistentStateComponent<ConfigureValues>, ProjectComponent
{
    private ConfigureValues configureValues;
    private ConfigurePanel configurePanel;

    public ConfigureProject(ConfigureValues configureValues) {
        this.configureValues = configureValues;
    }

    @Nls
    @Override
    public String getDisplayName()
    {
        return "Team Pulse";
    }

    @Nullable
    @Override
    public String getHelpTopic()
    {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent()
    {
        configurePanel = new ConfigurePanel();
        return configurePanel.configPanel;
    }

    @Override
    public boolean isModified()
    {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException
    {
        configureValues.configUrl = configurePanel.configUrl.getText();
        /**
         * TODO: Convert this to getPassword and store as a string instead of a char[]
         */
        //noinspection deprecation
        configureValues.configPassword = configurePanel.configPasswordInput.getText();
        configureValues.configUsername = configurePanel.configUsernameInput.getText();
    }

    @Override
    public void reset()
    {
        configurePanel.configUrl.setText(configureValues.configUrl);
        configurePanel.configPasswordInput.setText(configureValues.configPassword);
        configurePanel.configUsernameInput.setText(configureValues.configUsername);
    }

    @Override
    public void disposeUIResources()
    {

    }

    @Nullable
    @Override
    public ConfigureValues getState() {
        return configureValues;
    }

    @Override
    public void loadState(ConfigureValues configureValues) {
        configureValues.loadFromInstance(configureValues);
    }

    @Override
    public void projectOpened() {

    }

    @Override
    public void projectClosed() {

    }

    @Override
    public void initComponent() {

    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "ConfigureProject";
    }
}
