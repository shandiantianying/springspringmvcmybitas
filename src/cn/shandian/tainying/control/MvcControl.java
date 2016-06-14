package cn.shandian.tainying.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.shandian.tianying.entity.LoginUser;

@Controller
@RequestMapping("/admin")
public class MvcControl {
	@RequestMapping("/hello.do")
	public String hello(HttpServletRequest request) {
		System.out.print("username:" + request.getParameter("username"));
		System.out.print("password:" + request.getParameter("password"));

		return "hello";
	}

	@RequestMapping("/login.do")
	public String Login(LoginUser loginUser, ModelMap model) {
		if ("admin".equals(loginUser.getUsername())) {
			model.addAttribute("username", loginUser.getUsername());
			model.put("password", loginUser.getPassword());
			return "hello";
		}
		return "error";
	}

}
