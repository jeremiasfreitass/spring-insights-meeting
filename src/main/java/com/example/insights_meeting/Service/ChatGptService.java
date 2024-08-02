package com.example.insights_meeting.Service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface ChatGptService {
    Mono<String> getInsightsFromTranscription(String transcription);
}
