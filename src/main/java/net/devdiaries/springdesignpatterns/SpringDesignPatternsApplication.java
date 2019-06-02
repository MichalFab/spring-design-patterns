package net.devdiaries.springdesignpatterns;

import net.devdiaries.springdesignpatterns.prototype.SpringPrototype;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringDesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDesignPatternsApplication.class, args);
    }

    @Bean
    @Scope("prototype")
    public SpringPrototype prototype(){
        return new SpringPrototype();
    }

}
