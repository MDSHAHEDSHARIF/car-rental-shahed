package com.ikubinfo.rental.controller;

import com.ikubinfo.rental.service.user.UserService;
import com.ikubinfo.rental.service.user.dto.UserFilter;
import com.ikubinfo.rental.service.user.dto.UserModel;
import com.ikubinfo.rental.service.user.dto.UserPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.ikubinfo.rental.controller.constants.ApiConstants.CLIENT_APP;
import static com.ikubinfo.rental.controller.constants.ApiConstants.USER_PATH;

@RestController
@RequestMapping(path = USER_PATH, produces = "application/json")
@CrossOrigin(CLIENT_APP)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserPage> getAll(@RequestBody UserFilter userFilter) {
        return new ResponseEntity<>(userService.getAll(userFilter), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }

    @PutMapping(path = "/update/profile", consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void editProfile(@RequestBody UserModel user) {
        userService.editProfile(user);
    }

    @PutMapping(path = "/update/password", consumes = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void editPassword(@RequestBody UserModel user) {
        userService.editPassword(user);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete() {
        userService.delete();
    }
}
