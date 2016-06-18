package cn.shandian.tianying.service;

import cn.shandian.tianying.entity.LoginUser;
import cn.shandian.tianying.entity.User;

public interface AdminServer {
	User login(User adm) throws Exception;
}
