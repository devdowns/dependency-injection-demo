package com.devdowns.dependency_injection_demo.models;

import com.devdowns.dependency_injection_demo.enums.ComputerMakers;
import com.devdowns.dependency_injection_demo.interfaces.Computer;
import lombok.Data;

@Data
public class MacBook implements Computer {
    private final String model;
    private final String program;
    private final String maker = ComputerMakers.APPLE.toString();


    public MacBook(String model, String program){
        this.model = model;
        this.program = program;
    }

    private MacBook() {
        program = null;
        model = null;
    }


}
