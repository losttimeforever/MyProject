package com.itjinling.store.service;

import java.sql.SQLException;
import java.util.List;

import com.itjinling.store.pojo.City;
import com.itjinling.store.pojo.Province;
import com.itjinling.store.pojo.User;


public interface UserService {
//
//	//查询省份
//	List<Province> findProvinceAll() throws SQLException;
//	//查询城市
//	List<City> findCityByPid(String pid) throws SQLException;
	//注册
	void regist(User user) throws SQLException;
	
	//登陆
//	User findByUser(String username, String password) throws SQLException;
	User findByUsername(String username) throws SQLException;
	User findByPassword(String password) throws SQLException;


//	List<City> findCityByPid(String pid) throws SQLException;
//
//
//	List<Province> findProvinceAll() throws SQLException;
	
	
	
}
