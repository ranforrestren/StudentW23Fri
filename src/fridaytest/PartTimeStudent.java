/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fridaytest;

/**
 *
 * @author sorai
 */
public class PartTimeStudent extends StudentW23Fri {
    
    private int numOfCourse;
    
    public PartTimeStudent(String studentId, String studentName, int numOfCourse) {
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }
    
}
