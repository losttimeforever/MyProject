package com.itjinling.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.itjinling.store.pojo.City;
import com.itjinling.store.pojo.Province;
import com.itjinling.store.pojo.User;

public interface UserDao {

//	User findByUsername(String username) throws SQLException;

//	List<Province> findProvinceAll() throws SQLException;

//	List<City> findCityByPid(String pid) throws SQLException;

	void regist(User user) throws SQLException;

	User findByUsername(String username) throws SQLException;

	User findByPassword(String password) throws SQLException;

//	List<City> findCityByPid(String pid) throws SQLException;
//
//	List<Province> findProvinceAll() throws SQLException;
	

//	User findByUser(String username, String password) throws SQLException;

}
