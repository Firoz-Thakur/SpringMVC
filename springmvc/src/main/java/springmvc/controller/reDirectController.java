package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class reDirectController {

	
	@RequestMapping("/one")
	public String one()
	{
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/two")
	public String  two()
	{
		return "";
	}
	
	@RequestMapping("/three")
	public RedirectView redirectView()
	{
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
}
