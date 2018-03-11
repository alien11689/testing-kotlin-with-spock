package com.github.alien11689.testingkotlinwithspock

import spock.lang.Specification

class AdultValidator04Test extends Specification {
    AdultValidator sut = new AdultValidator()

    def 'should validate age #age'() {
        when:
            ValidationStatus result = sut.validate(age)
        then:
            result.class.isAssignableFrom(expected)
        where:
            age | expected
            0   | Error
            17  | Error
            18  | Ok
            19  | Ok
    }
}
