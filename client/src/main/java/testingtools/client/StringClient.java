package testingtools.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("zuulserver")
public interface StringClient {

	@RequestMapping(method = RequestMethod.GET, value = "/microservicestring")
	 public String home();
	
	@RequestMapping(method = RequestMethod.GET, value = "/locate")
	 public String geoinfo();
}
