package cn.shandian.tianying.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.shandian.tianying.entity.LoginUser;
import cn.shandian.tianying.entity.User;
import cn.shandian.tianying.service.AdminServer;

@Controller
@RequestMapping("/admin")
public class MvcControl {
//	@Autowired
//	private AdminServer adminService;
//
//	public AdminServer getAdminService() {
//		return adminService;
//	}
//
//	public void setAdminService(AdminServer adminService) {
//		this.adminService = adminService;
//	}

	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest request) {
		System.out.print("username:" + request.getParameter("username"));
		System.out.print("password:" + request.getParameter("password"));

		return "hello";
	}

//	@RequestMapping("/login.do")
//	public String Login(User user, ModelMap model) {
//
//		// if ("admin".equals(loginUser.getUserName()) {
//		// model.addAttribute("username", loginUser.getUsername());
//		// model.put("password", loginUser.getPassword());
//		// return "hello";
//		// }
//		// return "error";
//		System.out.println("login.do");
//		try {
//			adminService.login(user);
//			model.addAttribute("username", user.getUserName());
//			// model.put("password", loginUser.getPassword());
//		} catch (Exception e) {
//			e.printStackTrace();
//			model.addAttribute("errorMessage", e.getMessage());
//			return "error";
//		}
//		return "hello";
//
//	}

}
