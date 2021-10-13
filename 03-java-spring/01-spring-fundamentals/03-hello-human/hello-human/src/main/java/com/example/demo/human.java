package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class human {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery,  Model model) {
        if(searchQuery != null){
        model.addAttribute("name", searchQuery);
            return "NewFile.jsp";
        }
        else
        	model.addAttribute("name", "Human");
        	return "NewFile.jsp";
	}
	

}
