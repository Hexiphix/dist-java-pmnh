package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dinosaurs")
public class DinoController {

    @RequestMapping("/newdiscovery")
    public String showNewDinosaurs() {
        return "pages/new-dinosaur";
    }
}
