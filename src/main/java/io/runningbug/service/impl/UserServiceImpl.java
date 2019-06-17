package io.runningbug.service.impl;

import io.runningbug.dao.mapper.UserMapper;
import io.runningbug.dao.model.User;
import io.runningbug.dao.model.UserExample;
import io.runningbug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangxf
 * @date 2019/06/17 0017 14:58
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    UserMapper userMapper;

    @Override
    public String login(String name, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria c = example.createCriteria();
        c.andNameEqualTo(name);
        c.andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() > 0) {
            return "登录成功";
        }
        return "登录失败";
    }
}
