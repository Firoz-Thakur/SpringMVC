package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Student;
import springmvc.model.User;
import springmvc.service.StudentService;
import springmvc.service.UserService;

@Controller
public class contactController {

	
	@RequestMapping("/contact")
	public String showForm()
	{
		
		return "contact";	
	}
	
	// using @RequestParm
//	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handelForm(
//			@RequestParam("email") String userEmail ,
//			@RequestParam("name")String userName ,
//			@RequestParam("password") String userPassword,Model model)
//	{
////		System.out.println(userEmail);
////		System.out.println(userName);
////		System.out.println(userPassword);	
////		model.addAttribute("name", userName);
////		model.addAttribute("email", userEmail);
////		model.addAttribute("password", userPassword);
//		
//		User user = new User(userEmail,userName,userPassword );
//		System.out.println(user);
//		model.addAttribute("user",user);
//		return "success";
//	}
	
	
	// using ModelAttribute
	
	//for working with spring orm
	@Autowired
	private UserService userService;
	
	@Autowired 
	private StudentService studentService;
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handelForm(@ModelAttribute User user,  Model model)
	{
		if(user.getEmail().isBlank() || user.getName().isBlank() || user.getPassword().isBlank())
			return "redirect:/contact";
		this.userService.createUser(user);
 		System.out.println(user);
		model.addAttribute("user",user);
		return "success";
	}
	
	@RequestMapping("/complexform")
	public String showComplextForm()
	{
		
		return "complexform";	
	}
	
	
	
	@RequestMapping(path="/handle",method = RequestMethod.POST)
	public String handelComplextForm(@ModelAttribute Student student )
	{
		
 		System.out.println(student.getCourses());		
		this.studentService.createStudent(student);

	
		return "success";
		
	}

	
}
