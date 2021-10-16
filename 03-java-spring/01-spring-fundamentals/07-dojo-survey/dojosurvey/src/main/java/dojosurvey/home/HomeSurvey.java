package dojosurvey.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeSurvey {
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, 
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			@RequestParam("comment") String comment, Model view )
	{
		view.addAttribute("name", name);
		view.addAttribute("location", location);
		view.addAttribute("language", language);
		view.addAttribute("comment", comment);
		return "result.jsp";
	}

}
