package com.github.alien11689.testingkotlinwithspock

import spock.lang.Ignore
import spock.lang.Specification

class AdultValidator01Test extends Specification {
    AdultValidator sut = new AdultValidator()

    @Ignore
    def 'should validate age #age'() {
        expect:
            sut.validate(age) == result
        where:
            age | result
            0   | Error
            17  | Error
            18  | Ok
            19  | Ok
    }
}
