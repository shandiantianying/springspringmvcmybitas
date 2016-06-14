import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shandian.tianying.dao.IUser;
import cn.shandian.tianying.entity.Article;
import cn.shandian.tianying.entity.User;

public class smtest {
	private static IUser iUser;
	private static ApplicationContext act;
	static {
		act = new ClassPathXmlApplicationContext("beans.xml");
		iUser = (IUser) act.getBean("userMapper");
	}

	@Test
	public void queryUser() {
		User user = iUser.selectUserById(1);
		System.out.println(user.getUserName() + "-----" + user.getUserAddress());
	}

	@Test
	public void queryListUser() {
		List<User> lusers = iUser.selectUsers("");
		for (User lu : lusers) {
			System.out.println(lu.getId() + "----" + lu.getUserName() + "-----" + lu.getUserAddress());
		}

	}

	@Test
	public void addUser() {
		User user = new User();
		user.setUserName("张三丰");
		user.setUserAge("135");
		user.setUserAddress("他vefq人 机锋网");
		iUser.addUser(user);
		System.out.println(user.getId());
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setId(8);
		user.setUserName("小明");
		user.setUserAge("45");
		user.setUserAddress("刻录机倒萨发大幅大和");
		iUser.updateUser(user);
	}

	@Test
	public void getUserArticle() {
		List<Article> articles = iUser.getUserArticle(1);
		for (Article article : articles) {
			User user = article.getUser();
			System.out.println(article.getTitle() + "---" + article.getContent() + "---" + user.getUserName() + "---"
					+ user.getUserAddress() + "---" + user.getUserAge());
		}
	}

	@Test
	public void getUserByUser() {
		User user = new User();
		user.setUserName("12");
		user.setUserAge("1111");
		List<User> users = iUser.selectUserbyUser(user);
		for (User ul : users) {
			System.out.println(ul.getId() + "----" + ul.getUserName() + "-----" + ul.getUserAddress());
		}
	}

	@Test
	public void getLikeUserByUser() {
		User user = new User();
		user.setUserName("jim");
		List<User> users = iUser.selectlikeUserByUser(user);
		for (User ul : users) {
			System.out.println(ul.getId() + "----" + ul.getUserName() + "-----" + ul.getUserAddress());
		}
	}

	@Test
	public void geUserCount() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("uAge", 12);
		map.put("user_count", -1);

		iUser.geUserCount(map);
		System.out.println(map.get("user_count"));
	}

}
