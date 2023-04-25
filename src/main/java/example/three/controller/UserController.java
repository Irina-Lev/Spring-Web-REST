package example.three.controller;


import example.three.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class UserController {
    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping
    public UserDto createUser (
            @RequestBody DataOfUserDto dataOfUserDto
    ) {
       return userFacade.createUser(dataOfUserDto);

    }

    @GetMapping
    public List<UserDto> findAllUsers () {
     return  userFacade.findAllUsers();
    }

    @GetMapping ("/{contactId}")
    public UserDto getUser (
            @PathVariable long contactId
    ) {
        return userFacade.getUser(contactId);
    }

    @PutMapping ("/{contactId}")
    public UserDto editUser (
            @PathVariable long contactId,
            @RequestBody DataOfUserDto dataOfUserDto
    ) {
        return userFacade.editUser(contactId, dataOfUserDto);
    }
}
