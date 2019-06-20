package com.enjoy.cap11.Service;

import com.enjoy.cap11.Dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:waken
 * @Date: Created in 2019/6/16 18:30
 * @Description:
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public void addOrder() {
        orderDao.insert();
    }
}
