package pl.karwsz.FocusProjectManager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String main() {
        return "main";
    }


    @GetMapping("/phpmyadmin")
    public String phpMyAdmin() {
        return "E:/phpMyAdmin/index.php";
    }

    //

}
