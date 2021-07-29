package com.devdowns.dependency_injection_demo.services;

import com.devdowns.dependency_injection_demo.builders.ComputerBuilder;
import com.devdowns.dependency_injection_demo.enums.ComputerMakers;
import com.devdowns.dependency_injection_demo.factories.ComputerFactory;
import com.devdowns.dependency_injection_demo.interfaces.Computer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    private final ComputerFactory factory;
    private final ComputerBuilder builder;

    public ComputerService(final ComputerFactory factory, final ComputerBuilder builder){
        this.factory = factory;
        this.builder = builder;
    }

    public List<Computer> getComputers() {
        return List.of(factory.get("Macbook"),factory.get("ThinkPad"));
    }

    public Computer assemble(final ComputerMakers maker, final String model, final String program) {
        final var laptop = (Computer) builder.withMaker(maker)
                .withModel(model)
                .withProgram(program)
                .build();

        return laptop;
    }
}
