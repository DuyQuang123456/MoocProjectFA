package fa.training.moocprojectfafull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {
    @GetMapping(value = "/login")
    public String loginSignup(){
        return "login_signup/formRegisterUser";
    }
    @GetMapping(value = "/chatbox")
    public String chatBox(){
        return "chatbox/chatBox";
    }
}
