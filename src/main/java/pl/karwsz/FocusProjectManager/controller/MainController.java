package pl.karwsz.FocusProjectManager.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping
    public String getMapping() {
        return "Mapping";
    }


}
