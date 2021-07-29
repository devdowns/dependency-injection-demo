package com.devdowns.dependency_injection_demo.models;

import com.devdowns.dependency_injection_demo.enums.ComputerMakers;
import com.devdowns.dependency_injection_demo.interfaces.Computer;
import lombok.Data;

@Data
public class Thinkpad implements Computer {
    private final String model;
    private final String program;
    private final String maker = ComputerMakers.LENOVO.toString();

    public Thinkpad(String model, String program){
        this.model = model;
        this.program = program;
    }

    private Thinkpad(){
        this.model = null;
        this.program = null;
    }

}
