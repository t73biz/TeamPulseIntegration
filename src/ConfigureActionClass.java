import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by Ron on 7/5/2014.
 */
public class ConfigureActionClass extends AnAction
{
    public void actionPerformed(AnActionEvent event)
    {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(
                project,
                "What is your name?",
                "Configure TeamPulse Integration",
                Messages.getQuestionIcon()
        );
        Messages.showMessageDialog(
                project,
                "Hello, " + txt + "!\n I am glad to see you.",
                "Information",
                Messages.getInformationIcon()
        );
    }
}
