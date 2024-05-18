package org.example.secondProject.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicId}")
    public Topic getTopic(@PathVariable String topicId){
        return topicService.getTopic(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic body){
        topicService.addTopic(body);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic body, @PathVariable String id){
        topicService.updateTopic(body, id);
    }
}
