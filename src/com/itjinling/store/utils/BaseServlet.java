package com.itjinling.store.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//接收参数
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String methodName = req.getParameter("method");
		//判断方法是否为空
		if (methodName == null || methodName.equals("")) {
			resp.getWriter().println("method参数为null");
		}
		//获得class
		Class clazz = this.getClass();
		try {
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//让方法执行
			String path = (String) method.invoke(this, req,resp);
			if (path != null) {
				req.getRequestDispatcher(path).forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
