package com.oneleven.course;

import com.oneleven.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable Long topicId) {
        return this.courseService.getAllCourses(topicId);
    }

    @GetMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable Long topicId, @PathVariable Long courseId) {
        return this.courseService.getCourse(topicId, courseId);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@PathVariable Long topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId));
        this.courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course, @PathVariable Long topicId, @PathVariable Long courseId) {
        course.setTopic(new Topic(topicId));
        return this.courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void removeCourse(@PathVariable Long id) {
        this.courseService.removeCourse(id);
    }

}