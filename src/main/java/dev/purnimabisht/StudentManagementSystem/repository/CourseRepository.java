package dev.purnimabisht.StudentManagementSystem.repository;

import dev.purnimabisht.StudentManagementSystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
