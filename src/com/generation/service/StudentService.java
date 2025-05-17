package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        if ( students.containsKey( studentId ) ) {
            return true;
        }
        return false;
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println("Existing students:");

        for(String key: students.keySet()) {
            //For each students, show the students' details (id, name, email)
            Student student = students.get(key);
            System.out.println(student);

            //on top of that, show the courses each student is taking
            System.out.println("Courses taken by " + student.getId());
            for(Course course: student.getCourses()) {
                System.out.println(course + " grade=" +student.getGrade(course.getCode()));

            }
        }

    }

    public boolean enrollToCourse( String studentId, Course course )
    {
        boolean status = false;

        if ( students.containsKey( studentId ) )
        {
            status = students.get( studentId ).enrollToCourse( course );
            students.get( studentId ).registerApprovedCourse( course );
        }

        return status;
    }


}
