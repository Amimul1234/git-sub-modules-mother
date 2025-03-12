package com.rahi.submoduletest.controller;

import com.rahi.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("get-name")
    public String getName() {
        TestDto testDto = new TestDto();
        testDto.setName("Rahi");
        testDto.setAge("25");
        return "Name is: " + testDto.getName() + " and age is: " + testDto.getAge();
    }
}
