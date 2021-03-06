package com.texas.csit.attendance;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class AttendanceAddPanel extends javax.swing.JPanel {

    ArrayList<JCheckBox> checkBoxes;

    /**
     * Creates new form AttendanceAddPanel
     */
    public AttendanceAddPanel() {
        initComponents();
        attendanceNotAvailablePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendanceAddOuterPanel = new javax.swing.JPanel();
        attendanceAddDisplayPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        studentScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        attendanceNotAvailablePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        attendanceAddOuterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendance Add", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        attendanceAddDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student's roll numbers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        studentScrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout attendanceAddDisplayPanelLayout = new javax.swing.GroupLayout(attendanceAddDisplayPanel);
        attendanceAddDisplayPanel.setLayout(attendanceAddDisplayPanelLayout);
        attendanceAddDisplayPanelLayout.setHorizontalGroup(
            attendanceAddDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceAddDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendanceAddDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        attendanceAddDisplayPanelLayout.setVerticalGroup(
            attendanceAddDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceAddDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        attendanceNotAvailablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N

        javax.swing.GroupLayout attendanceNotAvailablePanelLayout = new javax.swing.GroupLayout(attendanceNotAvailablePanel);
        attendanceNotAvailablePanel.setLayout(attendanceNotAvailablePanelLayout);
        attendanceNotAvailablePanelLayout.setHorizontalGroup(
            attendanceNotAvailablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceNotAvailablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        attendanceNotAvailablePanelLayout.setVerticalGroup(
            attendanceNotAvailablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceNotAvailablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout attendanceAddOuterPanelLayout = new javax.swing.GroupLayout(attendanceAddOuterPanel);
        attendanceAddOuterPanel.setLayout(attendanceAddOuterPanelLayout);
        attendanceAddOuterPanelLayout.setHorizontalGroup(
            attendanceAddOuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceAddOuterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendanceAddOuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attendanceNotAvailablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendanceAddDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        attendanceAddOuterPanelLayout.setVerticalGroup(
            attendanceAddOuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceAddOuterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attendanceNotAvailablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendanceAddDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attendanceAddOuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attendanceAddOuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int i = 0;
        for (JCheckBox checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                i++;
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, "Please select atleast one student's roll number to update.");
        } else {
            Date attendanceDate = new Date();
            Timestamp timestamp = new Timestamp(attendanceDate.getTime());
            Connection cn = DatabaseConnection.getConnection();
            try {
                for (JCheckBox c : checkBoxes) {
                    Statement stat = cn.createStatement();
                    if (c.isSelected()) {
                        String sql = "insert into attendance_info (roll_no, attendance_status, attendance_date) values (" + c.getText() + ", 'P', '" + timestamp + "')";
                        stat.executeUpdate(sql);
                    } else {
                        String sql = "insert into attendance_info (roll_no, attendance_status, attendance_date) values (" + c.getText() + ", 'A', '" + timestamp + "')";
                        stat.executeUpdate(sql);
                    }
                }
                JOptionPane.showMessageDialog(null, "Attendance updated!");
                jLabel1.setText("You updated attendance for today.");
                displayStudentsForAttendance();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed!");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel attendanceAddDisplayPanel;
    private javax.swing.JPanel attendanceAddOuterPanel;
    private javax.swing.JPanel attendanceNotAvailablePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane studentScrollPane;
    // End of variables declaration//GEN-END:variables

    public void displayStudentsForAttendance() {
        checkBoxes=new ArrayList<>();
        jPanel1.removeAll();
        AttendanceModel model = new AttendanceModel();
        if (model.getTodaysAttendance().size() > 0) {
            jLabel1.setText("You have already done for today.");
            attendanceNotAvailablePanel.setVisible(true);
            attendanceAddDisplayPanel.setVisible(false);
        } else {
            attendanceNotAvailablePanel.setVisible(false);
            attendanceAddDisplayPanel.setVisible(true);
            jPanel1.removeAll();
            jPanel1.setLayout(new GridLayout(0, 2, 10, 10));
            Connection cn = DatabaseConnection.getConnection();
            String sql = "Select * from student";
            ArrayList<String> studentList = new ArrayList<>();
            try {
                Statement stat = cn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                while (rs.next()) {
                    String name = rs.getString("roll_number");
                    studentList.add(name);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            for (String s : studentList) {
                JCheckBox cb = new JCheckBox();
                cb.setText(s);
                checkBoxes.add(cb);// for button functionality
                jPanel1.add(cb);
            }
        }
    }
}
