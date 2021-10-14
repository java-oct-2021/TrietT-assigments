package datetime.display;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTime {
	private Date getDate()
	{
		Date now = new Date();
		return now;
	}
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model display)
	{
		display.addAttribute("datedisplay", getDate());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model display)
	{
		display.addAttribute("datedisplay", getDate());
		return "time.jsp";
	}

}
