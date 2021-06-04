package com.oneleven;

import com.oneleven.department.Department;
import com.oneleven.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

        Department t = context.getBean(Department.class);
        t.display();
        System.out.println(t.toString());
    }

}
