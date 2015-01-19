package testingtools.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class PhraseRetriever {

	@Autowired
	private StringClient stringClient;

	@HystrixCommand(fallbackMethod="retrieveFallbackGeoinfo")
	public String geoInfo() {
		return stringClient.geoinfo();
	}

	@HystrixCommand(fallbackMethod="retrieveFallbackHome")
	public String home() {
		
		return stringClient.home();
	}
	
	public String retrieveFallbackGeoinfo() {
		return "Madrid";
	}
	
	public String retrieveFallbackHome() {
		return "hi fellas!";
	}
}
