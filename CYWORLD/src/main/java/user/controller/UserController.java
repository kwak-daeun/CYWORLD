package user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

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
	public void memberLogin() {
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
	
	@PostMapping("/login")
	@ResponseBody
	public int memberLogin(User user, HttpSession session) {
		logger.info("Login POST 확인");
		
		//로그인 인증
		boolean loginResult = userService.login(user);
		
		//로그인 유저 정보
		user = userService.getLoginInfo(user);
		
		if(loginResult) {
			//세션정보 객체 
			session.setAttribute("loginResult", loginResult);
			session.setAttribute("memberNo", user.getMemberNo());
			session.setAttribute("memberId", user.getMemberId());
		
			return 1;
		
		} else {
			session.invalidate();
			return 0;
		}
	}
	
	@GetMapping("/findId")
	public void memberIdFind() {
		logger.info("findId GET 확인");
	}
	
	@RequestMapping(value ="/findId.do", method = RequestMethod.POST)
	public String findId(HttpServletResponse response, @RequestParam("userId") 
	String userId, Model md) throws Exception{
		return userId;
		
	}
	
}