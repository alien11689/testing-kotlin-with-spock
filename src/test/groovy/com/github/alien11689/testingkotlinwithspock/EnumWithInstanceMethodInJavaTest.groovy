package com.github.alien11689.testingkotlinwithspock

import spock.lang.Specification

class EnumWithInstanceMethodInJavaTest extends Specification {
    def "should use enum method"() {
        expect:
            EnumWithInstanceMethodInJava.MINUS.sign() == '-'
    }

    def "should pass enum as parameter"() {
        given:
            Consumer consumer = new Consumer()
        expect:
            consumer.consume(EnumWithInstanceMethodInJava.MINUS) == '-'
    }

    static class Consumer {
        String consume(EnumWithInstanceMethodInJava e) {
            return e.sign()
        }
    }
}

