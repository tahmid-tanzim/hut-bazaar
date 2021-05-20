package com.oneleven.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>();

    public TopicService() {
        this.topics.add(new Topic(1l, "Spring Framework", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        this.topics.add(new Topic(2l, "Django Framework", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."));
        this.topics.add(new Topic(3l, "Laravel Framework", "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(Long id) {
        try {
            return this.topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void addTopic(Topic topic) {
        this.topics.add(topic);
    }

    public void updateTopic(Long id, Topic topic) {
        for (int i = 0; i < this.topics.size(); i++) {
            Topic t = this.topics.get(i);
            if(t.getId().equals(id)) {
                this.topics.set(i, topic);
                return;
            }
        }
    }

    public void removeTopic(Long id) {
        this.topics.removeIf(x -> x.getId().equals(id));
    }
}
