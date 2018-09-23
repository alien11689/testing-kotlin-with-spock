package com.github.alien11689.testingkotlinwithspock.defaultmethod

class FakeKotlinOrderRepository implements KotlinOrderRepository {
    private Map<OrderId, Order> data = [:]

    @Override
    void save(Order order) {
        data[order.id] = order
    }

    @Override
    Order find(OrderId orderId) {
        return data[orderId]
    }

    Order get(OrderId orderId) {
        return KotlinOrderRepository.DefaultImpls.get(this, orderId)
    }
}
