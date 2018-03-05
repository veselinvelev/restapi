package com.springboot.demo.restapi.topic;

import org.springframework.stereotype.Component;

@Component
public class Topic {

    String id;
    String name;
    String description;

    public Topic(){}

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
