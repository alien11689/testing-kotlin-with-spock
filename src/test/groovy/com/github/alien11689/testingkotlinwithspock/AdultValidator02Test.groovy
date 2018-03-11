package com.github.alien11689.testingkotlinwithspock

import spock.lang.Ignore
import spock.lang.Specification

class AdultValidator02Test extends Specification {
    AdultValidator sut = new AdultValidator()

    @Ignore
    def 'should validate age #age'() {
        expect:
            sut.validate(age) == result
        where:
            age | result
            0   | new Error()
            17  | new Error()
            18  | new Ok()
            19  | new Ok()
    }
}
