package user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import user.service.face.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 서비스 객체
	@Autowired private UserService userService;
	
	// 테스트
	@RequestMapping("/login")
	public void main() {
		logger.info("USER 확인");
	}
}