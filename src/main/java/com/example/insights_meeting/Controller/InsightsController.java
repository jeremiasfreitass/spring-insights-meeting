package com.example.insights_meeting.Controller;

import com.example.insights_meeting.Service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/insights")
public class InsightsController {

    private final ChatGptService chatGptService;

    @Autowired
    public InsightsController(ChatGptService chatGptService) {
        this.chatGptService = chatGptService;
    }

    @PostMapping
    public Mono<String> getInsights(@RequestBody String transcription) {
        return chatGptService.getInsightsFromTranscription(transcription);
    }
}