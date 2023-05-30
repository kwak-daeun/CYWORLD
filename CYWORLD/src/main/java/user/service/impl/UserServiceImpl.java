package user.service.impl;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.face.UserDao;
import user.service.face.UserService;

@Service
public class UserServiceImpl implements UserService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private UserDao userDao;

	// Context 객체
	@Autowired private ServletContext context;
}