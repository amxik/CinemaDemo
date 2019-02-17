package ua.org.amxik.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by amxik on 17.02.2019.
 */

@Configuration
@EnableTransactionManagement
@ComponentScan("ua.org.amxik")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("ua.org.amxik.repositories")
public class DataConfig {





}
