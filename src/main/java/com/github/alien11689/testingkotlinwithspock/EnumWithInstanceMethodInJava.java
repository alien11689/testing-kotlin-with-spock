package com.github.alien11689.testingkotlinwithspock;

public enum EnumWithInstanceMethodInJava {
    PLUS {
        public String sign() {
            return "+";
        }
    },
    MINUS {
        public String sign() {
            return "-";
        }
    };

    public abstract String sign();
}
