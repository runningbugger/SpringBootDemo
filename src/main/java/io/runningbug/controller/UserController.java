package io.runningbug.controller;

import io.runningbug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxf
 * @date 2019/06/17 0017 14:56
 */
@RestController
public class UserController {
    @Autowired
    @Qualifier("userService")
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        return userService.login(name, password);
    }
}
