package com.cgi.etcp.orch;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.HttpClient;

@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }

/*    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }*/
}
