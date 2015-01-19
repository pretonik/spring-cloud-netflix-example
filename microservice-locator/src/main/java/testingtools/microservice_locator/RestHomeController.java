package testingtools.microservice_locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {

	@Autowired
	private AppIntegration appIntegration;
	
	@RequestMapping("/hello")
    String home() {
        return "Hello World!"+appIntegration.retrieveStoreBeautyName();
    }
	
	@RequestMapping("/")
    String geoinfo() {
        return "latitud:2,23234 longitud:45.3222 ";
    }
}
