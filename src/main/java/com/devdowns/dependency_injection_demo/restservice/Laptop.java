package com.devdowns.dependency_injection_demo.restservice;

public interface Laptop {
    default String program() {
        return "just coding some stuff";
    }

    String getModel();


}
