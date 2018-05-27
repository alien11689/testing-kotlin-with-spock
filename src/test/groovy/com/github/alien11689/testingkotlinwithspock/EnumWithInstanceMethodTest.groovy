package com.github.alien11689.testingkotlinwithspock

import spock.lang.FailsWith
import spock.lang.Specification

class EnumWithInstanceMethodTest extends Specification {

    @FailsWith(Exception)
    def "should use enum method like in java"() {
        expect:
            EnumWithInstanceMethod.MINUS.sign() == '-'
    }

    def "should use enum method"() {
        expect:
            EnumWithInstanceMethod.@MINUS.sign() == '-'
    }

    def "should use enum method working"() {
        expect:
            EnumWithInstanceMethod.valueOf('MINUS').sign() == '-'
    }

    @FailsWith(Exception)
    def "should pass enum as parameter"() {
        expect:
            consume(EnumWithInstanceMethod.MINUS) == '-'
    }

    static String consume(EnumWithInstanceMethod e) {
        return e.sign()
    }
}

