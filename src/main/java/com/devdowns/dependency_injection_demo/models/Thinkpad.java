package com.devdowns.dependency_injection_demo.models;

import com.devdowns.dependency_injection_demo.enums.LaptopMakers;
import com.devdowns.dependency_injection_demo.restservice.Laptop;
import lombok.Data;

@Data
public class Thinkpad implements Laptop {
    private final String model;
    private final String program;
    private final String maker = LaptopMakers.LENOVO.toString();

    public Thinkpad(String model, String program){
        this.model = model;
        this.program = program;
    }

    private Thinkpad(){
        this.model = null;
        this.program = null;
    }

}
