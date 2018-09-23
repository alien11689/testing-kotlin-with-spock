package com.github.alien11689.testingkotlinwithspock.defaultmethod

class FakeJavaOrderRepository implements JavaOrderRepository {
    private Map<OrderId, Order> data = [:]

    @Override
    void save(Order order) {
        data[order.id] = order
    }

    @Override
    Optional<Order> find(OrderId orderId) {
        return Optional.ofNullable(data[orderId])
    }
}
