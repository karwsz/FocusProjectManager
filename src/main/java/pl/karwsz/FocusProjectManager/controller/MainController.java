package pl.karwsz.FocusProjectManager.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String main() {
        return "<!DOCTYPE HTML><html><head><body><p style=\"color:blue;font-size:40px;\">Test</p></body></head></html>";
    }

    //

}
