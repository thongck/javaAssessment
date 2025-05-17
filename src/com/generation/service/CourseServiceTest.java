package com.generation.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    CourseService courseService = new CourseService();

    @Test
    @DisplayName("get")
    void registerCourse() {
    }

    @Test
    @DisplayName("getCourse() method should return the same course code - INTRO-CS-1")
    void getCourse() {
        assertEquals("INTRO-CS-1", courseService.getCourse("INTRO-CS-1").getCode());
    }
}