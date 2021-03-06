package maxime.back.potes.controller;

import maxime.back.potes.dto.UserDto;
import maxime.back.potes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<UserDto> getUsers(){
        return this.userService.getAll();
    }

    @PostMapping
    public boolean createUser(@RequestBody UserDto user){
        return this.userService.createUser(user);
    }

    @GetMapping("/database")
    public List getAllDatabasesNames() {
        return this.userService.databasesNames();
    }
}
