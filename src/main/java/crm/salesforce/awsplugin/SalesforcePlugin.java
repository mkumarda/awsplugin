package crm.salesforce.awsplugin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesforcePlugin {

	@GetMapping("/crm")
	public String crm() {
		return "Your CRM is working fine!";
	}
	@GetMapping("/")
	public String myhome() {
		return "Hey Guys, Mahesh here Welcome to my home!";
	}


}