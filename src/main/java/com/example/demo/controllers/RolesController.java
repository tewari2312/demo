package com.example.demo.controllers;

import com.example.demo.bean.RoleObject;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("RolesController")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping("/roles")
public class RolesController {

    @RequestMapping(method = RequestMethod.POST,
        produces = {"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String createRole(@RequestBody final RoleObject roleObject) throws Exception{
        return new String("Role with name "+roleObject.getRoleName()+" has been created...");
    }


    @RequestMapping(value = "/{roleID}", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteRole(@PathVariable("roleID") String aclID) throws Exception{
        return new String("Role with ID "+aclID+" has been deleted...");
    }

}
