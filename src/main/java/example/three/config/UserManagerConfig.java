package example.three.config;

import example.three.InMemoryUserService;
import example.three.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagerConfig {
    @Bean
    public UserService userService () { return new InMemoryUserService();}
}
