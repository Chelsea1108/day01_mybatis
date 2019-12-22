package com.magic.dao;

import com.magic.domain.User;

import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2019/12/21 22:26
 */
public interface IUserDao {
    /**
     * @Description 查询所有操作
     * @Author Chelsea
     * @Date 2019/12/21 22:27
     */
    List<User> findAll();


}
