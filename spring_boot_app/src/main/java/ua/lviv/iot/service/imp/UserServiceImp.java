package ua.lviv.iot.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Event;
import ua.lviv.iot.domain.User;
import ua.lviv.iot.exception.EventNotFoundException;
import ua.lviv.iot.exception.UserNotFoundException;
import ua.lviv.iot.repository.EventRepository;
import ua.lviv.iot.repository.UserRepository;
import ua.lviv.iot.service.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User create(User user) {
        userRepository.save(user);
        return user;
    }

    @Transactional
    public void update(Integer id, User uUser) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        user.setUsername(uUser.getUsername());
        user.setPassword(uUser.getPassword());
        user.setFirstName(uUser.getFirstName());
        user.setLastName(uUser.getLastName());
        userRepository.save(user);
    }

    @Transactional
    public void delete(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        userRepository.delete(user);
    }

    @Transactional
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
