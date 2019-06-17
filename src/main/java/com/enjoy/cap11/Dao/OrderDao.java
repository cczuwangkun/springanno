package com.enjoy.cap11.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author:waken
 * @Date: Created in 2019/6/16 18:24
 * @Description:
 */
@Repository
@Transactional
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "INSERT INTO `order`(ordertime,ordermoney,orderstatus) VALUES (?,?,?)";

        jdbcTemplate.update(sql, new Date(), 20, 0);

        System.out.println("插入");

        int i=4/0;
    }
}
