package pl.karwsz.FocusProjectManager.facade;

import org.springframework.stereotype.Component;
import pl.karwsz.FocusProjectManager.converter.UserConverter;
import pl.karwsz.FocusProjectManager.dto.UserDto;
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

    public UserDto createUser(String username) {
        UserDto dto = new UserDto();
        dto.setUsername(username);

        userService.createUser(username);

        return dto;
    }

    public List<UserDto> findAllUsers() {
        return userService.findAllUsers().stream().map(u -> userConverter.convert(u)).collect(Collectors.toList());
    }

}
