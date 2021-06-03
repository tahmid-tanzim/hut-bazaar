package com.oneleven.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    private List<Course> courses = new ArrayList<>();

    public List<Course> getAllCourses(Long topicId) {
        List<Course> courses = new ArrayList<>();
        this.courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(Long topicId, Long courseId) {
        return this.courseRepository.findByTopicId(topicId)
                .stream()
                .filter(course -> course.getId().equals(courseId))
                .findFirst()
                .orElse(null);
    }

    public void addCourse(Course course) {
        this.courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course course) {
        return this.courseRepository.findById(id)
                .map(t -> {
                    t.setName(course.getName());
                    t.setDescription(course.getDescription());
                    return this.courseRepository.save(t);
                })
                .orElseGet(() -> {
                    course.setId(id);
                    return this.courseRepository.save(course);
                });
    }

    public void removeCourse(Long id) {
        this.courseRepository.deleteById(id);
    }
}
