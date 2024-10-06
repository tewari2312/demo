package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("ACLController")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping("/acl")
public class ACLController {

    @RequestMapping(method = RequestMethod.POST,
        produces = {"application/json"})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String createACL(@RequestBody final ACLObject aclObject) throws Exception{
        return new String("ACL with name "+aclObject.getAclName()+" has been created...");
    }


    @RequestMapping(value = "/{aclID}", method = RequestMethod.DELETE)
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteACL(@PathVariable("aclID") String aclID) throws Exception{
        return new String("ACL with ID "+aclID+" has been deleted...");
    }

}
