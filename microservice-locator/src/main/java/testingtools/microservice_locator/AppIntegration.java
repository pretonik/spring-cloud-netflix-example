package testingtools.microservice_locator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class AppIntegration {
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@HystrixCommand(fallbackMethod="retrieveFallbackName")
	public String retrieveStoreBeautyName(){
		
		InstanceInfo instanceInfo = discoveryClient.getNextServerFromEureka("stores", false);
		instanceInfo.getHomePageUrl();
		return "beauty store";
	}
	
	public String retrieveFallbackName(){
		return "fallback beauty store not found";
	}
}
