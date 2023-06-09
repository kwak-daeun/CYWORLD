package user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import user.dto.User;
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
	
	@GetMapping("/register")
	public void memberRegisterGet() {
		logger.info("Register GET 확인");
	}
	
	//회원가입
	@PostMapping("/register")
	@ResponseBody
	public String memberRegister(User user, HttpSession session) {
		logger.info("Register POST 확인");
		
		boolean RegisterResult = userService.join(user);
		
		if (RegisterResult) {
			logger.info("Register true 확인");
			logger.info("Register true : {}", user);
			
			return "redirect:/user/login";
		} else {
			
			logger.info("Register false 확인");
			logger.info("Register false : {}", user);

			return "redirect:/user/register";
		}
	}
}