package com.texas.csit.attendance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class AttendanceModel {

    public ArrayList<AttendanceInfoDto> getTodaysAttendance() {
        ArrayList<AttendanceInfoDto> attendanceList = new ArrayList<>();
        Connection cn = DatabaseConnection.getConnection();

        String date = getTodaysDate();
        String sql = "Select * from attendance_info where attendance_date LIKE '" + date + "%'";
        try {
            Statement stat = cn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                AttendanceInfoDto dto = new AttendanceInfoDto();
                dto.setAttendanceDate(rs.getString("attendance_date"));
                dto.setAttendanceStatus(rs.getString("attendance_status").charAt(0));
                dto.setId(Integer.parseInt(rs.getString("id")));
                dto.setRollNo(Integer.parseInt(rs.getString("roll_no")));
                attendanceList.add(dto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return attendanceList;
    }

    public String getTodaysDate() {
        Date attendanceDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(attendanceDate);
        return date;
    }
}
