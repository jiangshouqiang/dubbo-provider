package com.gr.jiang.provider.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gr.jiang.mod.hello.UserService;
import com.gr.jiang.po.User;

/**
 * Created by jiang on 2016/12/12.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public String sayHello(String s) {

        return "Hello " + s;
    }

    @Override
    public List getUsers() {

        List list = new ArrayList();
        User u1 = new User();
        u1.setName("hejingyuan");
        u1.setAge(20);

        User u2 = new User();
        u2.setName("xvshu");
        u2.setAge(21);

        list.add(u1);
        list.add(u2);

        return list;
    }
}
