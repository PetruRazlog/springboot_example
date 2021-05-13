package net.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(EmployeeConfig.class);
        context.refresh();

        System.out.println("=====================================================");

        EmployeeManager employeeManager = context.getBean(EmployeeManager.class);
        Employee employee = employeeManager.create();

        System.out.println(employee);
    }
}
