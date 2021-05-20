package com.oneleven.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic(1l, "Spring Framework", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        topics.add(new Topic(2l, "Django Framework", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."));
        topics.add(new Topic(3l, "Laravel Framework", "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        return topics;
    }
}