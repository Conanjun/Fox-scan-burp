package burp;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by fengxuan on 17/1/21.
 */

public class UIComponents extends javax.swing.JFrame {

    /**
     * Creates new form UIComponents
     */
//    public UIComponents() {
//        initComponents();
//    }


    /**
     * This method to create Top view
     * */

    public JPanel TopPanel(){
        JPanel jPanel = new JPanel();
        LabelTitle = new javax.swing.JLabel();
        LabelTitle.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        LabelTitle.setText("Foxscan BurpSuite Extender");

        jPanel.add(LabelTitle);

        return jPanel;
    }

    /**
     * This method to create label and text
     * */

    public JPanel middlePanel(){
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new TitledBorder("Options"));
        jPanel.setLayout(new GridLayout(6, 2, 10, 20));
//        jPanel.setLayout(null);

        LabelDomain = new javax.swing.JLabel();
        TextDomain = new javax.swing.JTextField();
        LabelSaddr = new javax.swing.JLabel();
        TextSqlAddr = new javax.swing.JTextField();
        TextWhiteList = new javax.swing.JTextField();
        Labelwhite = new javax.swing.JLabel();
        Labelblack = new javax.swing.JLabel();
        TextBlackList = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        Labeloptions = new javax.swing.JLabel();
        CheckBoxgetUsers = new javax.swing.JCheckBox();
        CheckBoxisDba = new javax.swing.JCheckBox();
        CheckBoxgetTables = new javax.swing.JCheckBox();
        CheckBoxgetColumns = new javax.swing.JCheckBox();
        CheckBoxgetDbs = new javax.swing.JCheckBox();
        CheckBoxdumpTable = new javax.swing.JCheckBox();

        //x y h v
        LabelDomain.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LabelDomain.setText("domain:");
//        LabelDomain.setBounds(new Rectangle(250, 50, 80, 50));

        TextDomain.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextDomain.setText("http://www.evalshell.com");
//        TextDomain.setBounds(new Rectangle(350, 50, 400, 40));

        LabelSaddr.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LabelSaddr.setText("sqlmap address:");
//        LabelDomain.setBounds(new Rectangle(250, 130, 80, 50));

        TextSqlAddr.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextSqlAddr.setText("http://127.0.0.1:8775");

        TextWhiteList.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextWhiteList.setText(".php,.asp,.aspx,.jsp,.jspx");

        Labelwhite.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labelwhite.setText("white List:");

        Labelblack.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labelblack.setText("black List:");

        TextBlackList.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextBlackList.setText(".ico,.flv,.js,.css,.jpg,.png,.jpeg,.gif,.pdf,.ss3,.txt,.rar,.zip,.avi,.mp4,.swf,.wmi,.exe,.mpeg");

        Labeloptions.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labeloptions.setText("Options:");

        CheckBoxgetUsers.setText("getUsers  ");
        CheckBoxgetUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetUsersActionPerformed(evt);
            }
        });

        CheckBoxisDba.setText("isDba");
        CheckBoxisDba.setToolTipText("");
        CheckBoxisDba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxisDbaActionPerformed(evt);
            }
        });

        CheckBoxgetTables.setText("getTables");
        CheckBoxgetTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetTablesActionPerformed(evt);
            }
        });

        CheckBoxgetColumns.setText("getColumns");
        CheckBoxgetColumns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetColumnsActionPerformed(evt);
            }
        });

        CheckBoxgetDbs.setText("getDbs");
        CheckBoxgetDbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetDbsActionPerformed(evt);
            }
        });

        CheckBoxdumpTable.setText("dumpTable");
        CheckBoxdumpTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxdumpTableActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSubmit.setText("Fuck It");

        btnReset.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnReset.setText("Back");


        jPanel.add(LabelDomain);
        jPanel.add(TextDomain);

        jPanel.add(LabelSaddr);
        jPanel.add(TextSqlAddr);

        jPanel.add(Labelwhite);
        jPanel.add(TextWhiteList);

        jPanel.add(Labelblack);
        jPanel.add(TextBlackList);


        JPanel jPaneloptions = new JPanel();
        jPaneloptions.setLayout(new FlowLayout());
        jPaneloptions.add(CheckBoxgetUsers);
        jPaneloptions.add(CheckBoxisDba);
        jPaneloptions.add(CheckBoxgetTables);
        jPaneloptions.add(CheckBoxgetColumns);
        jPaneloptions.add(CheckBoxgetDbs);
        jPaneloptions.add(CheckBoxdumpTable);

        jPanel.add(Labeloptions);
        jPanel.add(jPaneloptions);

        jPanel.add(btnSubmit);
        jPanel.add(btnReset);

        return jPanel;
    }


    /**
     * this method is to create footer view
     * */


    public JPanel FooterJpanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        Labeltalk = new javax.swing.JLabel();
        LabelDomain.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LabelDomain.setText("let's talk about how to take in car:");


        return jPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public JPanel initComponents(JPanel jPanel) {

        LabelTitle = new javax.swing.JLabel();
        LabelDomain = new javax.swing.JLabel();
        TextDomain = new javax.swing.JTextField();
        LabelSaddr = new javax.swing.JLabel();
        TextSqlAddr = new javax.swing.JTextField();
        TextWhiteList = new javax.swing.JTextField();
        Labelwhite = new javax.swing.JLabel();
        Labelblack = new javax.swing.JLabel();
        TextBlackList = new javax.swing.JTextField();
        Labeloptions = new javax.swing.JLabel();
        CheckBoxgetUsers = new javax.swing.JCheckBox();
        CheckBoxisDba = new javax.swing.JCheckBox();
        CheckBoxgetTables = new javax.swing.JCheckBox();
        CheckBoxgetColumns = new javax.swing.JCheckBox();
        CheckBoxgetDbs = new javax.swing.JCheckBox();
        CheckBoxdumpTable = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton("submit");
        btnReset = new javax.swing.JButton("reset");


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        LabelTitle.setText("Foxscan BurpSuite Extender");

        LabelDomain.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LabelDomain.setText("domain:");

        TextDomain.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextDomain.setText("http://www.evalshell.com");

        LabelSaddr.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LabelSaddr.setText("sqlmap address:");

        TextSqlAddr.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextSqlAddr.setText("http://127.0.0.1:8775");

        TextWhiteList.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextWhiteList.setText(".php,.asp,.aspx,.jsp,.jspx");

        Labelwhite.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labelwhite.setText("white List:");

        Labelblack.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labelblack.setText("black List:");

        TextBlackList.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        TextBlackList.setText(".ico,.flv,.js,.css,.jpg,.png,.jpeg,.gif,.pdf,.ss3,.txt,.rar,.zip,.avi,.mp4,.swf,.wmi,.exe,.mpeg");

        Labeloptions.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        Labeloptions.setText("Options:");

        CheckBoxgetUsers.setText("getUsers  ");
        CheckBoxgetUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetUsersActionPerformed(evt);
            }
        });

        CheckBoxisDba.setText("isDba");
        CheckBoxisDba.setToolTipText("");
        CheckBoxisDba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxisDbaActionPerformed(evt);
            }
        });

        CheckBoxgetTables.setText("getTables");
        CheckBoxgetTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetTablesActionPerformed(evt);
            }
        });

        CheckBoxgetColumns.setText("getColumns");
        CheckBoxgetColumns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetColumnsActionPerformed(evt);
            }
        });

        CheckBoxgetDbs.setText("getDbs");
        CheckBoxgetDbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxgetDbsActionPerformed(evt);
            }
        });

        CheckBoxdumpTable.setText("dumpTable");
        CheckBoxdumpTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxdumpTableActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSubmit.setText("Fuck It");

        btnReset.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnReset.setText("Back");
        /**
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btnSubmit)
                                                .addGap(38, 38, 38)
                                                .addComponent(btnReset))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CheckBoxdumpTable)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(TextBlackList, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextWhiteList, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextSqlAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(CheckBoxgetUsers)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(CheckBoxisDba)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CheckBoxgetTables)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CheckBoxgetDbs)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CheckBoxgetColumns))))
                                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(TextDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(TextSqlAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(TextWhiteList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(TextBlackList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(CheckBoxgetUsers)
                                        .addComponent(CheckBoxisDba)
                                        .addComponent(CheckBoxgetTables)
                                        .addComponent(CheckBoxgetDbs)
                                        .addComponent(CheckBoxgetColumns))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CheckBoxdumpTable)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSubmit)
                                        .addComponent(btnReset))
                                .addContainerGap(96, Short.MAX_VALUE))
        );
    */
        pack();

        return jPanel;

    }// </editor-fold>

    public void CheckBoxgetUsersActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CheckBoxisDbaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CheckBoxgetTablesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CheckBoxgetColumnsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CheckBoxgetDbsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CheckBoxdumpTableActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIComponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox CheckBoxgetUsers;
    private javax.swing.JCheckBox CheckBoxisDba;
    private javax.swing.JCheckBox CheckBoxgetTables;
    private javax.swing.JCheckBox CheckBoxgetColumns;
    private javax.swing.JCheckBox CheckBoxgetDbs;
    private javax.swing.JCheckBox CheckBoxdumpTable;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelDomain;
    private javax.swing.JLabel LabelSaddr;
    private javax.swing.JLabel Labelwhite;
    private javax.swing.JLabel Labelblack;
    private javax.swing.JLabel Labeloptions;
    private javax.swing.JLabel Labeltalk;
    private javax.swing.JTextField TextDomain;
    private javax.swing.JTextField TextSqlAddr;
    private javax.swing.JTextField TextWhiteList;
    private javax.swing.JTextField TextBlackList;
    // End of variables declaration
}
