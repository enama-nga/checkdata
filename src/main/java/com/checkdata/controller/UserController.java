package com.checkdata.controller;

import com.checkdata.model.User;
import com.checkdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

//    Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @PostMapping("/create")
   // @ApiOperation("Create user ")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update/{id}")
    //@ApiOperation("Update user find by ID ")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    //@ApiOperation("Delete user find by ID ")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/fetch/{id}")
    //@ApiOperation("find user find by ID ")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/fetchAll")
   // @ApiOperation("fetch All users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
