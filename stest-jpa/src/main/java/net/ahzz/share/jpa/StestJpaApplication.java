package net.ahzz.share.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.ahzz.share.*"})
public class StestJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StestJpaApplication.class, args);
    }

}
