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

	/**
	 * 根据主键删除
	 * @param id 主键
	 * @return 影响行数
	 */
	int delete(Long id);
}