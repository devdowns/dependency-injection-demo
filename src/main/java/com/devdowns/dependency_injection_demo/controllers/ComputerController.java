package com.devdowns.dependency_injection_demo.controllers;

import com.devdowns.dependency_injection_demo.constants.BuildSpecs;
import com.devdowns.dependency_injection_demo.enums.LaptopMakers;
import com.devdowns.dependency_injection_demo.restservice.Laptop;
import com.devdowns.dependency_injection_demo.services.ComputerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ComputerController {

    private final ComputerService compService;


    public ComputerController(final ComputerService compService){
        this.compService = compService;
    }

    @GetMapping("computer")
    public List<Laptop> computer(){
        return compService.getComputers();
    }

    @GetMapping("assemble")
    public Laptop assembleComp(@RequestParam final Map<String, String> queryMap){
        final var maker =  LaptopMakers.valueOf(queryMap.getOrDefault(BuildSpecs.MAKER, "APPLE").toUpperCase());
        final var model = queryMap.getOrDefault(BuildSpecs.MODEL, "m1 macbook pro");
        final var program = queryMap.getOrDefault(BuildSpecs.PROGRAM, "cobol");
        return compService.assemble(maker, model, program);
    }
}
