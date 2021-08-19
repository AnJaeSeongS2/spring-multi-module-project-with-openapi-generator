package com.sonan.example.shop.server.juice;

import com.linecorp.sample.juice.api.client.JuiceApi;
import com.linecorp.sample.juice.protocol.Juice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class JuiceService {
    private final JuiceApi api;

    @Autowired
    private JuiceService(JuiceApi api) {
        this.api = api;
    }

    public Mono<Juice> get() {
        return api.get();
    }
}