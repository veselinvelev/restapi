package com.springboot.demo.restapi.testprof;

import com.springboot.demo.restapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Profile("test")
public class TopicController {

    @Autowired
    private TopicService topicService1;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService1.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService1.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService1.addTopic(topic);
    }

}
