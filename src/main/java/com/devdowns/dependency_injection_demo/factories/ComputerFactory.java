package com.devdowns.dependency_injection_demo.factories;

import com.devdowns.dependency_injection_demo.models.MacBook;
import com.devdowns.dependency_injection_demo.models.Thinkpad;
import com.devdowns.dependency_injection_demo.interfaces.Computer;
import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;

@Component
public class ComputerFactory {

    public ComputerFactory() {}


    public Computer get(final String model){
        if("Macbook".equals(model)){
            return new MacBook("macbook pro 13", "swift");
        }

        else if("ThinkPad".equals(model)){
            return new Thinkpad("x1 nano","java");
        }

        throw new InvalidParameterException("Yikes");
    }
}
