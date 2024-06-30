package zsj.bigwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zsj.bigwork.pojo.User;
import zsj.bigwork.service.LoginService;

import java.util.Objects;

@RestController
@RequestMapping()
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public String login(@RequestBody User user){
        User user1 = new User();
         if (loginService.selectByUserName(user.getUsername())==null){
             loginService.insertUser(user);
             return "success";
         }else if(loginService.selectByUserName(user.getUsername()).getPassword().equals(user.getPassword())){
             return "success";
         }else{
             return "error";
         }

    }
}
