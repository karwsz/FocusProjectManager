package pl.karwsz.FocusProjectManager.converter;

import org.springframework.stereotype.Component;
import pl.karwsz.FocusProjectManager.dto.UserDto;
import pl.karwsz.FocusProjectManager.entity.User;

@Component
public class UserConverter {

    public UserDto convert(User source) {
        UserDto target = new UserDto();
        target.setUsername(source.getUsername());
        return target;
    }

}
