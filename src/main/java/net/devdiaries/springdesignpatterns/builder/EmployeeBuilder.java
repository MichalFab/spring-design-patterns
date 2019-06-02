package net.devdiaries.springdesignpatterns.builder;

public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private String employeeId;
    private String email;

    // Each setter returns EmployeBuilder object.
    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee buildEmployee() {
        return new Employee(firstName,lastName, employeeId, email);
    }
}
