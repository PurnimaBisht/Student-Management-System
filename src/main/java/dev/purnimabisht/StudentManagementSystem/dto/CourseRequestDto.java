package dev.purnimabisht.StudentManagementSystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDto {

    @JsonProperty("course_name")
    private String courseName;

    @JsonProperty("instructor_id")
    private long instructorId;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("updated_at")
    private Date updatedAt;
}
