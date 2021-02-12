package su.custom.greet.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import su.custom.greet.bean.HelloProperties;
import su.custom.greet.service.HelloService;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(HelloProperties properties){
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(properties);
        return helloService;
    }
}
