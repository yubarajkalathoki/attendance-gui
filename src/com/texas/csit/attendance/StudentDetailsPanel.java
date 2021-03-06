package com.texas.csit.attendance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class StudentDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentDetailsPanel
     */
    public StudentDetailsPanel() {
        initComponents();
        updateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        studentDetailsTable = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        studentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Roll No.", "Full Name", "Mobile Number", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentDetailsTable);
        if (studentDetailsTable.getColumnModel().getColumnCount() > 0) {
            studentDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            studentDetailsTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            studentDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            studentDetailsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            studentDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            studentDetailsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            studentDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            studentDetailsTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentDetailsTable;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        studentDetailsTable.invalidate();
        DefaultTableModel model = (DefaultTableModel) studentDetailsTable.getModel();
        model.setRowCount(0);
        Object[] rows = new Object[4];
        List<StudentDto> studentList = getStudentDtos();
        for(int i=0; i<studentList.size(); i++){
            rows[0]=studentList.get(i).getRollNo();
            rows[1]=studentList.get(i).getFullName();
            rows[2]=studentList.get(i).getMobileNumber();
            rows[3]=studentList.get(i).getSemester();
            model.addRow(rows);
        }
    }

    private List<StudentDto> getStudentDtos() {
        List<StudentDto> studentList = new ArrayList<>();
        Connection cn = DatabaseConnection.getConnection();
        String sql = "select * from student order by roll_number";
        try {
            Statement stat = cn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                StudentDto dto = new StudentDto();
                dto.setFullName(rs.getString("first_name") + " " + rs.getString("middle_name") + " " + rs.getString("last_name"));
                dto.setMobileNumber(rs.getString("contact_no"));
                dto.setRollNo(Integer.parseInt(rs.getString("roll_number")));
                dto.setSemester(rs.getString("semester"));
                studentList.add(dto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return studentList;
    }
}
