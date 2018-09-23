package com.github.alien11689.testingkotlinwithspock.defaultmethod

interface KotlinOrderRepository {
    fun save(order: Order)

    fun find(orderId: OrderId): Order?

    fun get(orderId: OrderId): Order =
            find(orderId) ?: throw NotFound()
}
