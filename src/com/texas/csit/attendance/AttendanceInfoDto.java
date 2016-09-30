
package com.texas.csit.attendance;

import java.util.Date;

/**
 *
 * @author Yuba Raj Kalathoki
 */
public class AttendanceInfoDto {
    private int id;
    private int rollNo;
    private char attendanceStatus;
    private String attendanceDate;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the rollNo
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * @return the attendanceStatus
     */
    public char getAttendanceStatus() {
        return attendanceStatus;
    }

    /**
     * @param attendanceStatus the attendanceStatus to set
     */
    public void setAttendanceStatus(char attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    /**
     * @return the attendanceDate
     */
    public String getAttendanceDate() {
        return attendanceDate;
    }

    /**
     * @param attendanceDate the attendanceDate to set
     */
    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
    
}
