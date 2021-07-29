package com.devdowns.dependency_injection_demo.models;

import com.devdowns.dependency_injection_demo.enums.LaptopMakers;
import com.devdowns.dependency_injection_demo.restservice.Laptop;
import lombok.Data;

@Data
public class MacBook implements Laptop {
    private final String model;
    private final String program;
    private final String maker = LaptopMakers.APPLE.toString();


    public MacBook(String model, String program){
        this.model = model;
        this.program = program;
    }

    private MacBook() {
        program = null;
        model = null;
    }


}
