package com.github.alien11689.testingkotlinwithspock.defaultmethod

import spock.lang.Specification

class KotlinRepositoryWithDefaultMethodTest extends Specification {
    OrderId orderId = new OrderId(UUID.randomUUID() as String)
    Order order = new Order(orderId, 'data')
    KotlinOrderRepository kotlinOrderRepository = new FakeKotlinOrderRepository()

    def 'should get order from kotlin repository'() {
        given:
            kotlinOrderRepository.save(order)
        expect:
            kotlinOrderRepository.get(orderId) == order
    }

    def 'should throw NotFound when order does not exist in kotlin repository'() {
        when:
            kotlinOrderRepository.get(orderId)
        then:
            thrown(NotFound)
    }
}
