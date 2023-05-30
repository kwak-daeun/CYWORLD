package reply.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import reply.service.face.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 서비스 객체
	@Autowired private ReplyService replyService;
	
	// 테스트
	@RequestMapping("/reply")
	public void main() {
		logger.info("REPLY 확인");
	}
}