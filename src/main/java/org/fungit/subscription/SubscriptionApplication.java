package org.fungit.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: Application
 * @Author: Fungit
 * @Since: 2023/2/28 15:07
 * @Project Subscription
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SubscriptionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SubscriptionApplication.class, args);
    }
}
