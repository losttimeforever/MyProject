package com.itjinling.store.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itjinling.store.dao.UserDao;
import com.itjinling.store.dao.impl.UserDaoImpl;
import com.itjinling.store.pojo.City;
import com.itjinling.store.pojo.Province;
import com.itjinling.store.pojo.User;
import com.itjinling.store.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	//
//	@Override
//	public List<Province> findProvinceAll() throws SQLException {
//		return userDao.findProvinceAll();
//	}
//
//	@Override
//	public List<City> findCityByPid(String pid) throws SQLException {
//		return userDao.findCityByPid(pid);
//	}
	
	//注册
	@Override
	public void regist(User user) throws SQLException {
		userDao.regist(user);
	}
	
	@Override
	public User findByUsername(String username) throws SQLException {
		return userDao.findByUsername(username);
	}
	@Override
	public User findByPassword(String password) throws SQLException {
		return userDao.findByPassword(password);
	}


	
	//登陆
//	@Override
//	public User findByPassword(String username,String password) throws SQLException {
//		return userDao.findByUser(username, password);
//	}

}
