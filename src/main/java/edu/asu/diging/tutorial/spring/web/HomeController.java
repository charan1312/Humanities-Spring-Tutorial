package edu.asu.diging.tutorial.spring.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.MoodServiceInterface;

@Controller
public class HomeController {

    @Autowired
    private MoodServiceInterface serviceImpl;
    
    @PostConstruct
    public void servicePostInit() {
        serviceImpl.postInit();
    }
    
    @RequestMapping(value="/")
    public String home(ModelMap map) {
        map.addAttribute("mood", serviceImpl.getCurrentMood());
        return "home";
    }
    
    @RequestMapping(value="/reason/{mood}")
    public String next(ModelMap map,@PathVariable("mood") String mood) {
        String reason = serviceImpl.getReason(mood);
        map.addAttribute("reasonMap",reason);
        return "next";
    }
    
    @RequestMapping(value="/about")
    public String about(ModelMap map) {
        return "about";
    }
}
