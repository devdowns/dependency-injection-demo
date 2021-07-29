package com.devdowns.dependency_injection_demo.services;
import com.devdowns.dependency_injection_demo.builders.ComputerBuilder;
import com.devdowns.dependency_injection_demo.enums.LaptopMakers;
import com.devdowns.dependency_injection_demo.factories.LaptopFactory;
import com.devdowns.dependency_injection_demo.restservice.Laptop;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComputerService {
    private final LaptopFactory factory;
    private final ComputerBuilder builder;

    public ComputerService(final LaptopFactory factory, final ComputerBuilder builder){
        this.factory = factory;
        this.builder = builder;
    }

    public List<Laptop> getComputers() {
        return List.of(factory.get("Macbook"),factory.get("ThinkPad"));
    }

    public Laptop assemble(final LaptopMakers maker, final String model, final String program) {
        final var laptop = (Laptop) builder.withMaker(maker)
                .withModel(model)
                .withProgram(program)
                .build();

        return laptop;
    }
}
