package dev.purnimabisht.StudentManagementSystem.service.impl;

import dev.purnimabisht.StudentManagementSystem.dto.CourseRequestDto;
import dev.purnimabisht.StudentManagementSystem.entity.Course;
import dev.purnimabisht.StudentManagementSystem.repository.CourseRepository;
import dev.purnimabisht.StudentManagementSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository ;

    @Override
    public Course addCourse(CourseRequestDto courseRequestDto) {
        Course course = new Course();
        course.setCourseName(courseRequestDto.getCourseName());
        course.setInstructorId(courseRequestDto.getInstructorId());
        course.setCreatedBy(courseRequestDto.getCreatedBy());
        course.setCreatedAt(new Date());
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course updateCourse(Long id, CourseRequestDto courseRequestDto) {
        Optional<Course> course = courseRepository.findById(id) ;
        if (!course.isEmpty()) {
            throw new RuntimeException("Course doesn't exist.");
        }
        Course updatedCourse = course.get();
        updatedCourse.setCourseName(courseRequestDto.getCourseName());
        updatedCourse.setInstructorId(courseRequestDto.getInstructorId());
        updatedCourse.setUpdatedBy(courseRequestDto.getUpdatedBy());
        updatedCourse.setUpdatedAt(new Date());
        return courseRepository.save(updatedCourse);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
