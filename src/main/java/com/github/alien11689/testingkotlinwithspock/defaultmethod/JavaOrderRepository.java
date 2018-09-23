package com.github.alien11689.testingkotlinwithspock.defaultmethod;

import java.util.Optional;

public interface JavaOrderRepository {
    void save(Order order);

    Optional<Order> find(OrderId orderId);

    default Order get(OrderId orderId) {
        return find(orderId).orElseThrow(NotFound::new);
    }
}
