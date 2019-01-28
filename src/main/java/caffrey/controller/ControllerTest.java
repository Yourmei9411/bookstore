package caffrey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import caffrey.service.ServiceTest;

@Controller
public class ControllerTest {

	@Autowired
	ServiceTest servicetest;
	
	@RequestMapping("testController")
	public String testController() {
		
		servicetest.test();
		
		return "success";
	}
	
}
