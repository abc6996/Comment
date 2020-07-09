package org.imooc.service.imp;

import java.util.List;

import org.imooc.bean.User;
import org.imooc.dao.UserDao;
import org.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public List<User> getList() {
		userDao.delete(1l);
		return userDao.select(null);
	}

}
