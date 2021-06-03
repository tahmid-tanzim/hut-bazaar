package com.oneleven.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<>();

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        this.topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Long id) {
        return this.topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic topic) {
        return this.topicRepository.findById(id)
                .map(t -> {
                    t.setName(topic.getName());
                    t.setDescription(topic.getDescription());
                    return this.topicRepository.save(t);
                })
                .orElseGet(() -> {
                    topic.setId(id);
                    return this.topicRepository.save(topic);
                });
    }

    public void removeTopic(Long id) {
        this.topicRepository.deleteById(id);
    }
}
