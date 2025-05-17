package com.generation.service;
import com.generation.model.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService;

    @BeforeEach
    public void setUp() {
        studentService = new StudentService();
    }

    @Test
    @DisplayName("subscribeStudent() method should allow isSubscribed('1234') to return TRUE")
    void subscribeStudent() throws ParseException {
        DateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy");
        Date birthDate = null;
        try {
            birthDate = formatter.parse("11/21/2000");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Student student = new Student( "1234", "David", "david@gmail.com", birthDate );

        studentService.subscribeStudent(student);

        assertTrue(studentService.isSubscribed("1234"));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("method findStudent() should not return any student")
    void findStudent() {
        //How do I find a student
        assertNull(studentService.findStudent("1111"));
    }
}