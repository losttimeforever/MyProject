package com.itjinling.store.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itjinling.store.pojo.City;
import com.itjinling.store.service.UserService;
import com.itjinling.store.service.impl.UserServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * 根据省份的ID查询市的信息Servlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
//			String pid = request.getParameter("pid");
//			UserService userService = new UserServiceImpl();
//			List<City> list = userService.findCityByPid(pid);
//			
//			//把list集合转成json
//			JsonConfig config = new JsonConfig();
//			config.setExcludes(new String[] {"pid"});
//			
//			JSONArray jsonArray = JSONArray.fromObject(list,config);
////			System.out.println(jsonArray.toString());
//			
//			response.setContentType("text/html;charset=UTF-8");
//			response.getWriter().println(jsonArray.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
