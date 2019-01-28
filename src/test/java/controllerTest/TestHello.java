package controllerTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHello {

	@RequestMapping("Hello")
	public String sayHello()
	{
		System.out.println("Hello World");
		
		return "success";
	}
	
}
