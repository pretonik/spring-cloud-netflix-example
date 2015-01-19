/**
 * 
 */
package testingtools.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pretonik
 *
 */
@RestController
public class RestHomeController {
	
	@Autowired
	private PhraseRetriever phraseRetriever;
	
	@RequestMapping("/")
	public String printPhrase() {
		 String results = phraseRetriever.home() + " I'm at " + phraseRetriever.geoInfo();
       return results;
	}
}
