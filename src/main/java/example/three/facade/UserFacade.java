package example.three.facade;

import example.three.UserService;
import example.three.controller.DataOfUserDto;
import example.three.controller.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserFacade {
    private final UserService userService;

@Autowired
    public UserFacade(UserService userService) {
        this.userService = userService;
    }

    public UserDto createUser(DataOfUserDto userDto) {
    var user = userService.addUser(userDto.getName(),  userDto.getSurname(),
            userDto.getPhoneNumber(), userDto.getEmail());
    return new UserDto(user);
    }

    public UserDto getUser (long userId) {
    var user = userService.getUser(userId);
    return new UserDto(user);
    }

    public UserDto editUser (long userId, DataOfUserDto userDto) {
        var user = userService.editUser(userId, userDto.getName(),
                userDto.getSurname(), userDto.getPhoneNumber(), userDto.getEmail());
        return new UserDto(user);
    }

    public List <UserDto> findAllUsers () {
    List <UserDto>  usersDto = new ArrayList<>();
    var users = userService.findAllUsers();
    for (int i =0; i<users.size(); i++) {
        usersDto.add(new UserDto(users.get(i)));
    }
    return usersDto;
    }
}
