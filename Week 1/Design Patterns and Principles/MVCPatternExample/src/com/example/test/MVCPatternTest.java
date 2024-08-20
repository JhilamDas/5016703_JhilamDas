package com.example.test;

import com.example.model.Student;
import com.example.view.StudentView;
import com.example.controller.StudentController;

public class MVCPatternTest {

    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("1", "Mary Johnson", "A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Mary Johnson");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}