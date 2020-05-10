package com.itjinling.store.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itjinling.store.pojo.City;
import com.itjinling.store.pojo.Province;
import com.itjinling.store.pojo.User;
import com.itjinling.store.service.UserService;
import com.itjinling.store.service.impl.UserServiceImpl;
import com.itjinling.store.utils.BaseServlet;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * 跳转网站链接
	 * 
	 */
	//首页
	public String index(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/index.jsp";
	}
	
	//注册页面
	public String registUI(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/regist.jsp";
	}
	
	//登陆
	public String loginUI(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/login.jsp";
	}
	
	//购物车
	public String cart(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/cart.jsp";
	}
	
	//公司简介
	public String info(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/info.jsp";
	}
	
	//商品信息
	public String product_info(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/product_info.jsp";
	}
	
	//商品列表
	public String product_list(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/product_list.jsp";
	}
	
	//购物车商品列表
	public String order_info(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/order_info.jsp";
	}
	
	//购物车商品列表
	public String order_list(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/order_list.jsp";
	}
	
//	public void parameter(HttpServletRequest req,HttpServletResponse resp) throws Exception {
//		//接收参数
//		req.setCharacterEncoding("UTF-8");	//数据库
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		String email = req.getParameter("email");
//		String telephone = req.getParameter("telephone");
//		String sex = req.getParameter("sex");
//		String birthday = req.getParameter("birthday");
//		//封装数据
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setEmail(email);
//		user.setSex(sex);
//		user.setTelephone(telephone);
//		user.setBirthday(birthday);
//	}
	
	public String success(HttpServletRequest req,HttpServletResponse resp) {
		return "/jsp/success.jsp";
	}
	
	//注册
	public String regist(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		//接收参数
		req.setCharacterEncoding("UTF-8");	//数据库
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String telephone = req.getParameter("telephone");
		String sex = req.getParameter("sex");
		String birthday = req.getParameter("birthday");
		//封装数据
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setSex(sex);
		user.setTelephone(telephone);
		user.setBirthday(birthday);
		//调用业务层
		UserService userService = new UserServiceImpl();
		try {
			userService.regist(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		//页面跳转
		resp.sendRedirect(req.getContextPath()+"/UserServlet?method=success");
		return null;
	}
	
	
	//登陆
	public String login(HttpServletRequest req,HttpServletResponse resp) {
		
		try {
			//接收参数
			req.setCharacterEncoding("UTF-8");	//form元素乱码
			String username = req.getParameter("username");		//从form接收参数
			String password = req.getParameter("password");
			//封装
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//调用业务层
			UserService userService = new UserServiceImpl();
			User existUser = userService.findByUsername(username);	//使用封装数据的user
			User existPassword = userService.findByPassword(password);
			
			resp.setContentType("text/html;charset=UTF-8");
			
			if (existUser == null || existPassword == null) {
				resp.getWriter().println("用户名或密码不能为空");
			}
			if ((!existUser.equals(username)) || (!existPassword.equals(password))) {	//比较的前者是从数据库接收到参数信息，后者是输入的参数信息
				//可以登陆
				resp.getWriter().println("登陆失败，用户名或密码不正确");
			}
			else {
				//用户名不正确不能登陆
				resp.getWriter().println("登陆失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return null;
	}
	
}
