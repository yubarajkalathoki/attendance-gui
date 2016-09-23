
package com.texas.csit.attendance;

import java.awt.BorderLayout;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class MainForm extends javax.swing.JFrame {

    private StudentRegisterPanel studentRegisterPanel;
    private StudentEditPanel studentEditPanel;
    private AttendanceAddPanel attendanceAddPanel;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        mainPanel.setLayout(new BorderLayout());
        
        //init objects
        
        studentRegisterPanel = new StudentRegisterPanel();
        studentEditPanel = new StudentEditPanel();
        attendanceAddPanel = new AttendanceAddPanel();
        
        //setting default visible false
        studentRegisterPanel.setVisible(false);
        studentEditPanel.setVisible(false);
        attendanceAddPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        studentRegisterMenuItem = new javax.swing.JMenuItem();
        addendanceAddMenuItem = new javax.swing.JMenuItem();
        attendanceEditMenuItem = new javax.swing.JMenu();
        studentEditMenuItem = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Management System");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        footerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Exit");

        jButton2.setText("Home");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jMenu1.setText("New");

        studentRegisterMenuItem.setText("Student");
        studentRegisterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRegisterMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(studentRegisterMenuItem);

        addendanceAddMenuItem.setText("Attendance");
        addendanceAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addendanceAddMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(addendanceAddMenuItem);

        jMenuBar1.add(jMenu1);

        attendanceEditMenuItem.setText("Edit");

        studentEditMenuItem.setText("Student");
        studentEditMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEditMenuItemActionPerformed(evt);
            }
        });
        attendanceEditMenuItem.add(studentEditMenuItem);

        jMenuItem4.setText("Attendance");
        attendanceEditMenuItem.add(jMenuItem4);

        jMenuBar1.add(attendanceEditMenuItem);

        jMenu3.setText("View");

        jMenuItem5.setText("Student");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Attendance");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Help");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(footerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentRegisterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRegisterMenuItemActionPerformed

        studentRegisterPanel.setVisible(true);
        mainPanel.add(studentRegisterPanel, BorderLayout.CENTER);
        
        studentEditPanel.setVisible(false);
                
        
    }//GEN-LAST:event_studentRegisterMenuItemActionPerformed

    private void studentEditMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEditMenuItemActionPerformed
        studentEditPanel.setVisible(true);
        mainPanel.add(studentEditPanel,BorderLayout.CENTER);
        
        studentRegisterPanel.setVisible(false);
    }//GEN-LAST:event_studentEditMenuItemActionPerformed

    private void addendanceAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addendanceAddMenuItemActionPerformed

        attendanceAddPanel.setVisible(true);
        mainPanel.add(attendanceAddPanel, BorderLayout.CENTER);
        
        
    }//GEN-LAST:event_addendanceAddMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addendanceAddMenuItem;
    private javax.swing.JMenu attendanceEditMenuItem;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem studentEditMenuItem;
    private javax.swing.JMenuItem studentRegisterMenuItem;
    // End of variables declaration//GEN-END:variables
}