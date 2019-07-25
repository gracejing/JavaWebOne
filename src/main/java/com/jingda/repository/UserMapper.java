package com.jingda.repository;

import com.jingda.model.UserBean;

import java.util.List;

public interface UserMapper {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (UserBean user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (UserBean user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    UserBean selectById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<UserBean> selectAll ();

}
