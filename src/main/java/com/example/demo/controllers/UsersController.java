package com.example.demo.controllers;

import com.example.demo.bean.UserObject;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("UsersController")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping("/users")
public class UsersController {

    @RequestMapping(method = RequestMethod.POST,
        produces = {"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody final UserObject userObject) throws Exception{
        return new String("user with username "+userObject.getUserName()+" has been created...");
    }


    @RequestMapping(value = "/{userID}", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteUser(@PathVariable("userID") String userID) throws Exception{
        return new String("User with ID "+userID+" has been deleted...");
    }

}
