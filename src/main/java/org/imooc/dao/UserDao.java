package org.imooc.dao;

import java.util.List;

import org.imooc.bean.User;

public interface UserDao {

	/**
	 * 根据查询条件查询用户列表
	 * @param user 查询条件
	 * @return 用户列表
	 */
	List<User> select(User user);
}