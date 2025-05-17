package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    private final Map<String, Integer> courseCreditsAwarded = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Map<String, Integer> getCourseCreditsAwarded() {
        return courseCreditsAwarded;
    }

    public boolean enrollToCourse(Course course )
    {
        //TODO implement this method
        if(courses.contains(course)) {
            return false;
        }
        this.courses.add(course);
        return true;
    }

    public boolean gradeCourse(String courseCode, Integer grade)
    {
        //TODO implement this method
        if(courseCreditsAwarded.containsKey(courseCode)) {
            return false;
        }
        this.courseCreditsAwarded.put(courseCode, grade);
        return true;
    }

    public String getGrade(String courseCode)
    {
        //TODO implement this method
        if(courseCreditsAwarded.containsKey(courseCode)) {
            return (Integer.toString(courseCreditsAwarded.get(courseCode)));
        }
        return "Not graded";
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
        //TODO implement this method
        if ( approvedCourses.containsKey( courseCode ) ) {
            return true;
        }
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return true;

            }
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        return courses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
