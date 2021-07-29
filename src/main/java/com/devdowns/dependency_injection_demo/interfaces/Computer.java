package com.devdowns.dependency_injection_demo.interfaces;

public interface Computer {
    default String program() {
        return "just coding some stuff";
    }



}
