package com.oneleven.topic;

class TopicNotFoundException extends RuntimeException {

    TopicNotFoundException(Long id) {
        super("Could not find topic " + id);
    }
}
