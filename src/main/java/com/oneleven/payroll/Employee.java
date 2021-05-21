package com.oneleven.payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id
    @GeneratedValue
    Long employeeId;
    private String name;
    private String role;

    Employee() {
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.employeeId, employee.employeeId) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.employeeId, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.employeeId + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
