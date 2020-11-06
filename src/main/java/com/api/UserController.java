package com.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> findUserList(){
        return userService.getAllUsers();
    }
    
    

   /*
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUser(@RequestParam(value = "user_id")int user_id,@RequestParam(value = "user_name")String user_name,@RequestParam(value = "user_address")String user_address){
        int falg=userService.addUser(user_id,user_name,user_address);
        if(falg>0){
            return "success";
        }
        return "error";
    }
    
    
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value = "user_id")int user_id){
        if(userService.deleteUser(user_id)>0){
            return "success";
        }
        return "error";
    }
    
    
    */

}

