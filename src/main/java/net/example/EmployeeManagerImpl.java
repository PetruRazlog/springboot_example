package net.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeManagerImpl implements EmployeeManager{
    @Override
    public Employee create() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Petru");
        employee.setLastName("Razlog");
        employee.setSalary(30000);
        employee.setEmployedAt(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));

        return employee;
    }
}
