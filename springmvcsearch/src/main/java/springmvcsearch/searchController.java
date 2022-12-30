package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class searchController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("in home view...");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView redirect(@RequestParam("queryBox") String query)
	{
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/search?q="+query);
		return redirectView;
	}
	
}
