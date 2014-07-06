/*
 * TeamPulse Integration Plugin
 * Copyright (c) 2014
 * by T73 Biz (http://t73.biz)
 */

package biz.t73.tpi.config;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.UISettings;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

class ConfigureAction extends AnAction
{
    public void actionPerformed(AnActionEvent event)
    {
        UISettings settings = UISettings.getInstance();
        LafManager lafManager = LafManager.getInstance();
        settings.fireUISettingsChanged();
        lafManager.updateUI();
    }
}
