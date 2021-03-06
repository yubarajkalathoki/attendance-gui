
package com.texas.csit.attendance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class StudentEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentEditPanel
     */
    public StudentEditPanel() {
        initComponents();
        studentEditInnerPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rollSearchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        studentEditInnerPanel = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        semesterTextField = new javax.swing.JTextField();
        rollNoTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        middleNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        contactNoTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(140, 49));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Roll No.:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rollSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rollSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap())
        );

        studentEditInnerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Edit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        semesterTextField.setEditable(false);

        rollNoTextField.setEditable(false);
        rollNoTextField.setEnabled(false);

        jLabel8.setText("Semester");

        jLabel9.setText("Roll No.");

        jLabel10.setText("First Name");

        jLabel11.setText("Middle Name");

        jLabel12.setText("Last Name");

        jLabel13.setText("Contact No.");

        javax.swing.GroupLayout studentEditInnerPanelLayout = new javax.swing.GroupLayout(studentEditInnerPanel);
        studentEditInnerPanel.setLayout(studentEditInnerPanelLayout);
        studentEditInnerPanelLayout.setHorizontalGroup(
            studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentEditInnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentEditInnerPanelLayout.createSequentialGroup()
                        .addComponent(editButton)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentEditInnerPanelLayout.createSequentialGroup()
                        .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semesterTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rollNoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(middleNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        studentEditInnerPanelLayout.setVerticalGroup(
            studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentEditInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentEditInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentEditInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentEditInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        if(rollSearchTextField.getText().length() ==0){
            JOptionPane.showMessageDialog(null, "Roll Number Required!");
            return;
        }

        int rollNo = Integer.parseInt(rollSearchTextField.getText());
        String sql = "select * from student where roll_number ="+rollNo;
        Connection cn = DatabaseConnection.getConnection();
        try {
            Statement stat = cn.createStatement();
            ResultSet rs = stat.executeQuery(sql);

            if(rs.next()){
                semesterTextField.setText(rs.getString("semester"));
                rollNoTextField.setText(rs.getString("roll_number"));
                firstNameTextField.setText(rs.getString("first_name"));
                middleNameTextField.setText(rs.getString("middle_name"));
                lastNameTextField.setText(rs.getString("last_name"));
                contactNoTextField.setText(rs.getString("contact_no"));
                studentEditInnerPanel.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Record Not Found!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int rollNo = Integer.parseInt(rollNoTextField.getText());
        String firstName = firstNameTextField.getText();
        String middleName = middleNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String contactNo = contactNoTextField.getText();
        
        Connection cn = DatabaseConnection.getConnection();
        
        String sql = "update student set first_name='"+firstName+"', middle_name='"+middleName+"', last_name='"+lastName+"', contact_no='"+contactNo+"' where roll_number= "+rollNo;
        
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited!");
            studentEditInnerPanel.setVisible(false);
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed!");
        }

    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField middleNameTextField;
    private javax.swing.JTextField rollNoTextField;
    private javax.swing.JTextField rollSearchTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField semesterTextField;
    private javax.swing.JPanel studentEditInnerPanel;
    // End of variables declaration//GEN-END:variables
}
