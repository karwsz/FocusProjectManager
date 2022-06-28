package pl.karwsz.FocusProjectManager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.karwsz.FocusProjectManager.dto.UserDto;
import pl.karwsz.FocusProjectManager.entity.User;
import pl.karwsz.FocusProjectManager.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Controller()
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/user/all")
    @ResponseBody
    public List<UserDto> getAllUsers() {
        List<User> allUsers = userService.findAllUsers();
        return allUsers.stream().map(user -> userService.convert(user)).collect(Collectors.toList());
    }

    @PostMapping("/user/create")
    public ResponseEntity<String> createUser(@ModelAttribute UserDto userDto) {
        userService.CreateUser(userDto.getUsername());
        return ResponseEntity.ok("User created : " + userDto.getUsername());
    }

}
