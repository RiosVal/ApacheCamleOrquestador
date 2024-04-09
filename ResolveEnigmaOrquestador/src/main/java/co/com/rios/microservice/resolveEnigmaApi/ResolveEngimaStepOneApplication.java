package co.com.rios.microservice.resolveEnigmaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.rios.microservice.resolveEnigmaApi", "co.com.rios.microservice.resolveEnigmaApi.api" , "co.com.rios.microservice.resolveEnigmaApi.config"})
public class ResolveEngimaStepOneApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(ResolveEngimaStepOneApplication.class).run(args);
    }
}
