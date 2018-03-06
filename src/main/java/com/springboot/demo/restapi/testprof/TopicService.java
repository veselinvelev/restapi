package com.springboot.demo.restapi.testprof;

import com.springboot.demo.restapi.topic.Topic;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Profile("test")
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javasvvccript", "Javascript", "Javascript Description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {

        return topics.stream()
                .filter(topic -> topic.getId().equals(id))
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
