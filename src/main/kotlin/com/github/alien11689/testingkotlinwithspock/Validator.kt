package com.github.alien11689.testingkotlinwithspock

sealed class ValidationStatus
object Ok : ValidationStatus()
object Error : ValidationStatus()


interface Validator<T> {
    fun validate(value: T): ValidationStatus
}

class AdultValidator : Validator<Int> {
    override fun validate(value: Int) = if (value >= 18) Ok else Error
}