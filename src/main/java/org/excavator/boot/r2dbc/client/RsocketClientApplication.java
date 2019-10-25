package org.excavator.boot.r2dbc.client;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.rsocket.RSocketRequester;
public class RsocketClientApplication{

    @SneakyThrows
    public static void main (String [] args) {
        SpringApplication.run(RsocketClientApplication.class, args);

        System.in.read();
    }

    @Bean
    RSocketRequester rSocketRequester(RSocketRequester.Builder builder){
        return builder.connectTcp("localhost", 7777).block();
    }
}
