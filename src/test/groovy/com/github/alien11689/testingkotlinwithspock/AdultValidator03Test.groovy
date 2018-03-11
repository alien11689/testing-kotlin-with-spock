package com.github.alien11689.testingkotlinwithspock

import spock.lang.Specification

class AdultValidator03Test extends Specification {
    AdultValidator sut = new AdultValidator()

    def 'should validate age #age'() {
        expect:
            sut.validate(age) == result
        where:
            age | result
            0   | Error.INSTANCE
            17  | Error.INSTANCE
            18  | Ok.INSTANCE
            19  | Ok.INSTANCE
    }
}
