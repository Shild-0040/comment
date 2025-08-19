package com.shield.controller;

import com.shield.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论Controller
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
//     Logger log = LoggerFactory.getLogger(CommentController.class);
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String query(){
        int userTotal = userService.countUserTotal();
        log.trace("trace级别日志");
        log.debug("debug级别日志");
        log.warn("warn级别日志");
        log.error("error级别日志");
        log.info("评论项目可以打印日志了");
//        查询用户总人数
         return  "用户总人数"+userTotal;
    }
}
