// #package com.jtspringproject.JtSpringProject;

// #import org.springframework.boot.SpringApplication;
// #import org.springframework.boot.autoconfigure.SpringBootApplication;
// #import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

// #@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
// #public class JtSpringProjectApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(JtSpringProjectApplication.class, args);
// 	}

// }


package com.jtspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // important!

@SpringBootApplication
public class JtSpringProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JtSpringProjectApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JtSpringProjectApplication.class);
    }
}
