package cn.shandian.tianying.dao;

import java.util.List;
import java.util.Map;

import cn.shandian.tianying.entity.Article;
import cn.shandian.tianying.entity.User;

public interface IUser {
	public User selectUserById(int id);

	public List<User> selectUsers(String userName);

	public void addUser(User user);

	public void updateUser(User user);

	public List<Article> getUserArticle(int id);

	public List<User> selectUserbyUser(User user);

	public List<User> selectlikeUserByUser(User user);

	public void geUserCount(Map<String,Integer> map);

}
