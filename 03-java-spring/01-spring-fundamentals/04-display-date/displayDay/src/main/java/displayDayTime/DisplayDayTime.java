package displayDayTime;

import java.text.SimpleDateFormat; 
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  


@Controller
public class DisplayDayTime {
	@RequestMapping("/")
	public String day()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String getDay(Model view)
	{
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String viewDay = dateformat.format(date);
		view.addAttribute("Day", viewDay);
		return "day.jsp";
	}
	@RequestMapping("/time")
	public String getTime(Model view)
	{
		view.addAttribute("Time", ZonedDateTime.now());
		return "time.jsp";
	}

}
