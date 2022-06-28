package pl.karwsz.FocusProjectManager.facade;

import org.springframework.stereotype.Component;
import pl.karwsz.FocusProjectManager.converter.UserConverter;
import pl.karwsz.FocusProjectManager.dto.UserDto;
import pl.karwsz.FocusProjectManager.entity.User;
import pl.karwsz.FocusProjectManager.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class UserFacade {


    @Resource
    private UserService userService;

    @Resource
    private UserConverter userConverter;


    public List<UserDto> findAllUsers() {
        return userService.findAllUsers().stream().map(u -> userService.convert(u)).collect(Collectors.toList());
    }

}