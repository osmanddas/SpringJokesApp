package org.osmand.springjokesapp.controller;

import org.osmand.springjokesapp.service.JokesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/"})
    public String showJoke(Model model){
        logger.info("in showJoke....");
        model.addAttribute("joke", jokesService.getJokes());
        return "chucknorris";
    }


}
