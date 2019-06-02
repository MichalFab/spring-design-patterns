package net.devdiaries.springdesignpatterns.controller;

import net.devdiaries.springdesignpatterns.builder.Employee;
import net.devdiaries.springdesignpatterns.builder.EmployeeBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping("employee1")
    public Employee getEmployee1() {
        return new EmployeeBuilder()
                .setEmployeeId("1234")
                .setEmail("test@test.com")
                .setFirstName("John")
                .setLastName("smith")
                .buildEmployee();
    }

    @GetMapping("employee2")
    public Employee getEmployee2() {
        return new EmployeeBuilder()
                .setEmployeeId("4321")
                .setFirstName("Jeff")
                .setLastName("Freeman")
                .buildEmployee();
    }
}
