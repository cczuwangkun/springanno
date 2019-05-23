package com.enjoy.cap9.Service;

import com.enjoy.cap9.Dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:waken
 * @Date: Created in 2019/5/4 16:16
 * @Description:
 */
@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public void print() {
        System.out.println(testDao);
    }
}
