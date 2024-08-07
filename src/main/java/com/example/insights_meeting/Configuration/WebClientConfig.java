package com.example.insights_meeting.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.util.Logger;
import reactor.util.Loggers;

@Configuration
public class WebClientConfig {
    private static final Logger log = Loggers.getLogger(WebClientConfig.class);

    @Value("${openai.api.key}")
    private String openaiApiKey;

    @Value("${openai.api.base-url}")
    private String openaiBaseUrl;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(openaiBaseUrl)
                .defaultHeader("Authorization", "Bearer " + openaiApiKey)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
