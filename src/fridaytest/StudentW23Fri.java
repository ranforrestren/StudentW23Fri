/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fridaytest;

/**
 *
 * @author sorai
 */
public class StudentW23Fri {
    private String studentId;
    private String studentName;

    public StudentW23Fri(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }
}