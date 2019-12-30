package deze.practice.SpringJokes.controller;

import deze.practice.SpringJokes.services.GetJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private GetJokeService getJokeService;


    public JokeController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    @RequestMapping( {"/",""})
    public String sayJoke(Model model) {


        model.addAttribute("joke", getJokeService.sayJoke());

        return "joke";
    }

}
