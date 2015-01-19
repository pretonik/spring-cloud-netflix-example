package testingtools.microservice_locator;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan
//@EnableTurbine
public class LocatorApp 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(LocatorApp.class).web(true).run(args);
    }
}
