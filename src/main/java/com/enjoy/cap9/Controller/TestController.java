package com.enjoy.cap9.Controller;

import com.enjoy.cap9.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author:waken
 * @Date: Created in 2019/5/4 16:15
 * @Description:
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
}
