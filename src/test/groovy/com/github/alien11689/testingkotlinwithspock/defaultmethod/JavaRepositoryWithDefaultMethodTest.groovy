package com.github.alien11689.testingkotlinwithspock.defaultmethod

import spock.lang.Specification

class JavaRepositoryWithDefaultMethodTest extends Specification {
    OrderId orderId = new OrderId(UUID.randomUUID() as String)
    Order order = new Order(orderId, 'data')
    JavaOrderRepository javaOrderRepository = new FakeJavaOrderRepository()

    def 'should get order from java repository'() {
        given:
            javaOrderRepository.save(order)
        expect:
            javaOrderRepository.get(orderId) == order
    }

    def 'should throw NotFound when order does not exist in java repository'() {
        when:
            javaOrderRepository.get(orderId)
        then:
            thrown(NotFound)
    }
}
