package com.itjinling.store.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itjinling.store.pojo.Province;
import com.itjinling.store.service.UserService;
import com.itjinling.store.service.impl.UserServiceImpl;

/**
 * Servlet implementation class ServletDemo7
 */
public class ProvinceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//查询所有省份的信息
//			UserService userService = new UserServiceImpl();
//			List<Province> list = userService.findProvinceAll();
//			request.setAttribute("list", list);
//			request.getRequestDispatcher("/07_jq_province_json/regist.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
