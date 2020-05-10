package com.itjinling.store.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itjinling.store.dao.UserDao;
import com.itjinling.store.pojo.City;
import com.itjinling.store.pojo.Province;
import com.itjinling.store.pojo.User;
import com.itjinling.store.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {
	
	QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
//	@Override
//	public User findByUsername(String username) throws SQLException {
//		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
//		String sql = "select * from user where username = ?";
//		User user = queryRunner.query(sql, new BeanHandler<User>(User.class),username);
//		return user;
//	}
//
//	@Override
//	public List<Province> findProvinceAll() throws SQLException {
//		String sql ="select * from province";
//		List<Province> list = queryRunner.query(sql, new BeanListHandler<Province>(Province.class));
//		return list;
//	}
//
//	@Override
//	public List<City> findCityByPid(String pid) throws SQLException {
//		String sql ="select * from city where pid = ?";
//		List<City> list = queryRunner.query(sql, new BeanListHandler<City>(City.class),pid);
//		return list;
//	}
	
	@Override
	public void regist(User user) throws SQLException {
		String sql = "insert into user values (null,?,?,?,?,?,?)";
		Object[] params = {user.getUsername(),user.getPassword(),user.getEmail(),user.getTelephone(),user.getSex(),user.getBirthday()};
		queryRunner.update(sql,params);
	}
	@Override
	public User findByUsername(String username) throws SQLException {
		String sql = "select * from user where username = ?";
		User existUser = queryRunner.query(sql, new BeanHandler<User>(User.class),username);
		return existUser;
	}
	@Override
	public User findByPassword(String password) throws SQLException {
		String sql = "select * from user where password = ?";
		User existPassword = queryRunner.query(sql, new BeanHandler<User>(User.class),password);
		return existPassword;
		
	}
	
	

//	@Override
//	public User findByUser(String username,String password) throws SQLException {
//		String sql ="select * from user where username = ? and password = ?";
//		User user = queryRunner.query(sql, new BeanHandler<User>(User.class),username,password);
//		return user;
//	}

}
