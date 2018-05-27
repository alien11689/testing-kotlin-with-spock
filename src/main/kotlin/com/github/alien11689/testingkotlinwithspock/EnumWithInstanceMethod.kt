package com.github.alien11689.testingkotlinwithspock

enum class EnumWithInstanceMethod {
    PLUS {
        override fun sign(): String = "+"
    },
    MINUS {
        override fun sign(): String = "-"
    };

    abstract fun sign(): String
}