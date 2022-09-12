package ch.fhnw.acrm.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeController {

//    @RequestMapping("/homepage")
//    public String fun()
//    {
//        return"homepage/homepage";
//    }
    @RequestMapping(value="/welcome", method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute Welcome welcome)
    {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homepage/homepage");

        return modelAndView;
    }




}
