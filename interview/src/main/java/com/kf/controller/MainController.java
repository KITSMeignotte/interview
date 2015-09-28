package com.kf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kf.repository.PersonRepository;

//import com.kf.repository.PersonRepository;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel) {
        pModel.addAttribute("personne", "Regis");
        return "bonjour";
    }

}
