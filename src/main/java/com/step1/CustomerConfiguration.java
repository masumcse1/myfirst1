package com.step1;

import com.step1.ss.InfoAppS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
@Configuration
public class CustomerConfiguration {


    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner(InfoAppS infoApp) {
        return args -> {
            System.out.println("Command line runner hooray");
            System.out.println(companyName);
            System.out.println(
                    environment.getProperty("info.app.version"));
            System.out.println(infoApp);
        };
    }


}
