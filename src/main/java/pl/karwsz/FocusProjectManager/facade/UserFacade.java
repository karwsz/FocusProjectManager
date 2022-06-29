package pl.karwsz.FocusProjectManager.facade;

import org.springframework.stereotype.Component;
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


    public UserDto createUser(String username) {
        UserDto dto = new UserDto();
        dto.setUsername(username);

        userService.createUser(username);

        return dto;
    }

    public UserDto convert(User source) {
        UserDto target = new UserDto();
        target.setUsername(source.getUsername());
        return target;
    }


    public List<UserDto> findAllUsers() {
        return userService.findAllUsers().stream().map(this::convert).collect(Collectors.toList());
    }

}
