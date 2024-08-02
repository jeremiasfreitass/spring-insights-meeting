package com.example.insights_meeting.Service.Impl;

import com.example.insights_meeting.Service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ChatGptServiceImpl implements ChatGptService {
    private final WebClient webClient;

    @Autowired
    public ChatGptServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<String> getInsightsFromTranscription(String transcription) {
        String escapedTranscription = transcription.replace("\\", "\\\\").replace("\"", "\\\"");
        String requestBody = String.format("{\"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}]}", escapedTranscription);

        return webClient.post()
                .uri("/v1/chat/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class);
    }
}
