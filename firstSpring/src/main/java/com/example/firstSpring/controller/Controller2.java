package com.example.firstSpring.controller;

import com.example.firstSpring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : P LYU
 * @version : 1.0
 * @Project : firstSpring
 * @Package : com.example.firstSpring.controller
 * @ClassName : Controller2.java
 * @createTime : 2021/8/12 14:23
 * @Email : PEIYINGLYU@GMAIL.COM
 * @Description :
 *  解释什么是依赖注入.
 */
@RestController //payment
public class Controller2 {
    @Autowired
    private Service service;


}
