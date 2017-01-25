package burp;

import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

/**
 * Created by fengxuan on 17/1/21.
 */
public class BurpExtender implements IBurpExtender, ITab {
    public PrintWriter stdout;
    public IExtensionHelpers hps;
    public IBurpExtenderCallbacks cbs;
    public JTabbedPane jTabbedPane;
    public JPanel jPanelMain;
    private UIComponents uiComponents = new UIComponents();


    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.setExtensionName("BurpExtender");

        this.hps = callbacks.getHelpers();

        this.cbs = callbacks;

        this.stdout = new PrintWriter(callbacks.getStdout(), true);

        this.stdout.println("hello burp");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jPanelMain = new JPanel();
                jPanelMain.setLayout(new BorderLayout(10, 10));
                jPanelMain.setSize(1024, 768);

                jPanelMain.add(uiComponents.TopPanel(), BorderLayout.NORTH);

                jPanelMain.add(uiComponents.middlePanel(), BorderLayout.CENTER);

//                jTabbedPane.scrollRectToVisible(new Rectangle(500, 70));
//                jTabbedPane.addTab("Settings", jPanelMain);

                cbs.customizeUiComponent(jPanelMain);
                cbs.addSuiteTab(BurpExtender.this);
            }
        });
    }

    @Override
    public String getTabCaption() {
        return "Fox-Scan";
    }

    @Override
    public Component getUiComponent() {
        return jPanelMain;
    }
}
