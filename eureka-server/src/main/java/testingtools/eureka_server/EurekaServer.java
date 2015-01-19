package testingtools.eureka_server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@EnableEurekaServer
@EnableAutoConfiguration
//@EnableZuulProxy
//@EnableCircuitBreaker
//@EnableTurbine
public class EurekaServer 
{
	 public static void main(String[] args) {
	        new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
	    }
}
