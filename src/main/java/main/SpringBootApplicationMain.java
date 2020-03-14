package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootApplicationMain {
    // Spring应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
    }
}