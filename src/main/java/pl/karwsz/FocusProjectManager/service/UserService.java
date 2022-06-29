package pl.karwsz.FocusProjectManager.service;

import org.springframework.stereotype.Service;
import pl.karwsz.FocusProjectManager.converter.UserConverter;
import pl.karwsz.FocusProjectManager.dto.UserDto;
import pl.karwsz.FocusProjectManager.entity.User;
import pl.karwsz.FocusProjectManager.repository.UserRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserConverter userConverter;

    public User createUser(String userName) {
        User user = new User();
        user.setUsername(userName);
        return userRepository.save(user);
    }

    public User createUser(UserDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public UserDto convert(User user) {
        return userConverter.convert(user);
    }

}
