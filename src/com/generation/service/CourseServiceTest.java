package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseService = new CourseService();

    @Test
    @DisplayName("registerCourse() method should allow getCourse() to return the same course - INTRO-CS-8")
    void registerCourse() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        Course course = new Course("INTRO-CS-8", "Advanced Computer Science", 9, module);
        courseService.registerCourse(course);

        assertEquals(course, courseService.getCourse("INTRO-CS-8"));
    }

    @Test
    @DisplayName("getCourse() method should return the same course code - INTRO-CS-1")
    void getCourse() {
        assertEquals("INTRO-CS-1", courseService.getCourse("INTRO-CS-1").getCode());
    }
}