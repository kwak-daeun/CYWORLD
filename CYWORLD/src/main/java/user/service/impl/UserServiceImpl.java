package user.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.face.UserDao;
import user.dto.User;
import user.service.face.UserService;

@Service
public class UserServiceImpl implements UserService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private UserDao userDao;

	// Context 객체
	@Autowired private ServletContext context;

	@Override
	public boolean join(User user) {
		//중복된 id인지 확인(회원 DB )
		if(userDao.selectIdCheck(user) > 0 ) {
			logger.info("userServiceImpl 1 : {}", user);
			return false;
		}
		
		//회원가입 - DB삽입
		userDao.insert(user);
		
		if(userDao.selectIdCheck(user)>0) {
			logger.info("userServiceImpl 2 : {}", user);
			return true;
		}
		return false;	
	}
}