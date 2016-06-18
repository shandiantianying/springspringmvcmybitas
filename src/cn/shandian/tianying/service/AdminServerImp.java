package cn.shandian.tianying.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.shandian.tianying.utils.MyException;

import cn.shandian.tianying.entity.LoginUser;
import cn.shandian.tianying.entity.User;
import cn.shandian.tianying.utils.MapperUtils;

@Service
public class AdminServerImp implements AdminServer {

	@Override
	public User login(User user) throws Exception {
		List<User> users = MapperUtils.getiUser().selectUsers(user.getUserName());
		if (users == null) {
			throw new MyException("�û��˺Ų�����~");
		}
		// admin = adminMapper.selectByNameAndPassword(adm);
		// if (admin == null) {
		// throw new MyException("�������~");
		// }
		return users.get(0);
	}
}
