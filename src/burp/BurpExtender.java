package burp;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.URL;

/**
 * Created by fengxuan on 17/1/21.
 */
public class BurpExtender implements IBurpExtender, ITab, IHttpListener {
    public PrintWriter stdout;
    public String domain;
    public String sqladdr;
    public String whitelist;
    public String blacklist;

    public LinkedList queue;

    public IExtensionHelpers helpers;
    public IBurpExtenderCallbacks callbacks;

    public JTabbedPane jTabbedPane;
    public JPanel jPanelMain;

    public RequestResponseInfo actionTools;
    private UIComponents uiComponents = new UIComponents();



    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.setExtensionName("FoxScan");

        this.helpers = callbacks.getHelpers();

        this.callbacks = callbacks;

        this.callbacks.registerHttpListener(this);

        this.stdout = new PrintWriter(callbacks.getStdout(), true);


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jPanelMain = new JPanel();
                jPanelMain.setLayout(new BorderLayout(10, 10));
                jPanelMain.setSize(1024, 768);

                jTabbedPane = new JTabbedPane();

                jPanelMain.add(uiComponents.TopPanel(), BorderLayout.NORTH);

                jPanelMain.add(uiComponents.middlePanel(), BorderLayout.CENTER);

                uiComponents.btnSubmit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        domain = uiComponents.TextDomain.getText();
                        sqladdr = uiComponents.TextSqlAddr.getText();
                        whitelist = uiComponents.TextWhiteList.getText();
                        blacklist = uiComponents.TextBlackList.getText();

                    }
                });

                jTabbedPane .addTab("Settings", null, jPanelMain, null);

//                cbs.customizeUiComponent(jPanelMain);
                callbacks.addSuiteTab(BurpExtender.this);
            }
        });
    }

    @Override
    public String getTabCaption() {
        return "Fox-Scan";
    }

    @Override
    public Component getUiComponent() {
        return jTabbedPane;
    }


    @Override
    public void processHttpMessage(int toolFlag, boolean messageIsRequest, IHttpRequestResponse messageInfo) {

        actionTools = new RequestResponseInfo(helpers, messageInfo);

        URL url = actionTools.getUrl();
        Map<String, String> map = new TreeMap<String, String>();
//        if (url.toString().startsWith(domain)){

            if (actionTools.getMethod().equals("POST")){
                map.put(url.toString(), actionTools.getBody());
            }else if (actionTools.getMethod().equals("GET")){
                map.put(url.toString(), actionTools.getBody());
            }
        queue.add(map);
//        }
        stdout.println("queue: " + queue);

    }
}
