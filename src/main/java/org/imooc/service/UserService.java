package org.imooc.service;

import java.util.List;

import org.imooc.bean.User;

public interface UserService {
	/**
	 * 获取用户列表
	 * @return 用户列表
	 */
	List<User> getList();
}
