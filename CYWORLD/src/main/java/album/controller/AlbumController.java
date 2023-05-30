package album.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import album.service.face.AlbumService;

@Controller
@RequestMapping("/album")
public class AlbumController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 서비스 객체
	@Autowired private AlbumService albumService;
	
	// 테스트
	@RequestMapping("/album")
	public void main() {
		logger.info("ALBUM 확인");
	}
	
	// 사진첩 메인
	
	
	// 사진첩 조회
	
	
	// 사진첩 작성
	
	
	// 사진첩 수정
	
	
	// 사진첩 삭제
	
	
	
}