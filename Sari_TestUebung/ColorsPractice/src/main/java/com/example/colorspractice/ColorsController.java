package com.example.colorspractice;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.security.InvalidParameterException;

@RestController
public class ColorsController {
    @GetMapping
    public String me(@RequestParam String color) {
        int a = "red".compareTo(color);
        int b = "blue".compareTo(color);
        int c = "yellow".compareTo(color);

        if (a == 0) {
            return "green";
        } else {
            if (b == 0) {
                return "orange";
            } else {
                if (c == 0) {
                    return "purple";
                }
            }
            throw new InvalidParameterException();
        }
    }
}
