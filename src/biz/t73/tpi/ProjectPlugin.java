/*
 * TeamPulse Integration Plugin
 * Copyright (c) 2014
 * by T73 Biz (http://t73.biz)
 */

package biz.t73.tpi;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.components.ProjectComponent;
import biz.t73.tpi.config.ConfigureProject;
import biz.t73.tpi.config.ConfigureValues;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("FieldCanBeLocal")
class ProjectPlugin implements ProjectComponent
{
    private Project project;

    public ProjectPlugin(Project project)
    {
        this.project = project;
        ConfigureProject pc = project.getComponent(ConfigureProject.class);
        ConfigureValues config = pc.getState();
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
        return "TeamPulse Project Plugin";
    }
}
