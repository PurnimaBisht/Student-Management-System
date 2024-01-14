package dev.purnimabisht.StudentManagementSystem.service;

import dev.purnimabisht.StudentManagementSystem.dto.CourseRequestDto;
import dev.purnimabisht.StudentManagementSystem.entity.Course;

import java.util.Optional;

public interface CourseService {
    Course addCourse(CourseRequestDto courseRequestDto);

    Optional<Course> getCourse(Long id);

    Course updateCourse(Long id, CourseRequestDto courseRequestDto);

    void deleteCourse(Long id);
}
