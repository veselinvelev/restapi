package com.springboot.demo.restapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@Profile("hateoas")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

//        List<Topic> topics = topicService1.getAllTopics();
////        return topics.stream()
////                .map(t -> new Resource<Topic>(t, linkTo(TopicService_1.class).withSelfRel() ))
////                .collect(Collectors.toList());

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

}
