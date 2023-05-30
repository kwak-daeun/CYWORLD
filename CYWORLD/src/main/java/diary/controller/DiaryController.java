package diary.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import diary.service.face.DiaryService;

@Controller
@RequestMapping("/diary")
public class DiaryController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// 서비스 객체
	@Autowired private DiaryService diaryService;
	
	// 테스트
	@RequestMapping("/diary")
	public void main() {
		logger.info("DIARY 확인");
	}
}