package com.oneleven.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return this.topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable Long id) {
        return this.topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public Topic addTopic(@RequestBody Topic newTopic) {
        return this.topicService.addTopic(newTopic);
    }

}