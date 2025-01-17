package com.sonan.sample.coffee.api.client;

import com.sonan.example.model.Coffee;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;

/**
 * Recipe of expose specific implementation.
 * Pros. Most of deserialization libraries supports.
 *       And Don't need any verbose configuration.
 * Cons. This exposes concrete response class to outside.
 */
public interface CoffeeApi {

    @GET("/")
    Mono<Coffee> get();
}
