package flatinfo.rest.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		return "test";
	}
	
	@RequestMapping(value="search/{address}", method=RequestMethod.GET)
	public String searchUser(ModelMap model, @PathVariable("address") String address){
		System.out.println("The address is "+address);
		return address;
	}
	
	@RequestMapping(value="?search={address}", method = RequestMethod.GET)
	public String searchFlat(ModelMap model, @PathVariable("address") String address){
		System.out.println("Looking for a flat"+address);
		return "search";
	}
}
