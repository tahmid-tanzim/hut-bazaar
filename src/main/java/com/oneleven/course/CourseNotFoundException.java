package com.oneleven.course;

class CourseNotFoundException extends RuntimeException {

    CourseNotFoundException(Long id) {
        super("Could not find course " + id);
    }
}
