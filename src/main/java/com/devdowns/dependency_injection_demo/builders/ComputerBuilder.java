package com.devdowns.dependency_injection_demo.builders;

import com.devdowns.dependency_injection_demo.enums.ComputerMakers;
import com.devdowns.dependency_injection_demo.models.MacBook;
import com.devdowns.dependency_injection_demo.models.Thinkpad;
import com.devdowns.dependency_injection_demo.interfaces.Computer;
import org.springframework.stereotype.Component;

@Component
public class ComputerBuilder {
    private String program;
    private String model;
    private ComputerMakers maker;

    public ComputerBuilder() {}

    public ComputerBuilder withProgram(final String program) {
        this.program = program;
        return this;
    }

    public ComputerBuilder withModel(final String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder withMaker(final ComputerMakers makers) {
        this.maker = makers;
        return this;
    }

    public Computer build(){
        if(ComputerMakers.APPLE.equals(maker)){
            return new MacBook(this.model, this.program);
        }else if(ComputerMakers.LENOVO.equals(maker)){
            return new Thinkpad(this.model, this.program);
        }
        return null;
    }
}
