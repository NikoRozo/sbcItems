package com.niko.sbc.items.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${config.baseurl.endpoint.sbcProducts}")
    private String url;

    @Bean
    @LoadBalanced
    WebClient.Builder WebClient(){
        return WebClient.builder().baseUrl(this.url);
    }
}
