package testingtools.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class ConfigServerApp 
{
	@RequestMapping("/")
    public String home() {
        return "Hello World! config server running correctly";
    }
	
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfigServerApp.class, args);
    }
}
