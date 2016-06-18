package cn.shandian.tianying.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.dao.IUser;

public class MapperUtils {
	private static IUser iUser;

	public static IUser getiUser() {
		return iUser;
	}

	public static void setiUser(IUser iUser) {
		MapperUtils.iUser = iUser;
	}

	private static ApplicationContext act;
	static {
		act = new ClassPathXmlApplicationContext("beans.xml");
		iUser = (IUser) act.getBean("userMapper");
	}

}
