package com.fastcampus.ch6.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(value="/login/loginPage.do")
    public String loginPage() {
        return "/login/loginPage";
    }

    @RequestMapping(value="/login/accessDenied.do")
    public String accessDeniedPage() throws Exception {
        return "/login/accessDenied";
    }

}