package dev.purnimabisht.StudentManagementSystem.controller;

import dev.purnimabisht.StudentManagementSystem.dto.CourseRequestDto;
import dev.purnimabisht.StudentManagementSystem.entity.Course;
import dev.purnimabisht.StudentManagementSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CourseController {

    @Autowired
    private CourseService courseService ;

    @PostMapping("/course")
    public Course addCourse(@RequestBody CourseRequestDto courseRequestDto) {
        return courseService.addCourse(courseRequestDto);
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id) {
        Optional<Course> byId = courseService.getCourse(id);
        if(byId.isEmpty()){
            throw new RuntimeException("Course not found with id : " + id);
        }
        return byId.get() ;
    }

    @PutMapping("/course/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody CourseRequestDto courseRequestDto) {
        return courseService.updateCourse(id, courseRequestDto);
    }

    @DeleteMapping("/course/{id}")
    public void deleteCourse(@PathVariable Long id ) {
        Optional<Course> byId = courseService.getCourse(id);
        if(byId.isEmpty()){
            throw new RuntimeException("Course not found with id : " + id);
        }
        courseService.deleteCourse(id);
    }
}
